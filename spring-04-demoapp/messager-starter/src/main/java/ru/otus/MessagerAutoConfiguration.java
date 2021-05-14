package ru.otus;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;


@Configuration
@ConditionalOnClass(Messager.class)
@EnableConfigurationProperties(Props.class)
public class MessagerAutoConfiguration {
    private static final Logger logger = LoggerFactory.getLogger(MessagerAutoConfiguration.class);

    private final Props props;

    public MessagerAutoConfiguration(Props props) {
        this.props = props;
    }

    @Bean
    @ConditionalOnMissingBean
    public MessagerConfig messagerConfig() {
        String message = props.getMessage() == null ? "default message" : props.getMessage();
        logger.info("AutoConfig. creating MessagerConfig, default message:{}", message);
        return new MessagerConfig(message);
    }

    @Bean
    @ConditionalOnMissingBean
    public Messager messager(MessagerConfig messagerConfig) {
        logger.info("AutoConfig. creating Messager");
        return new Messager() {
            @Override
            public void printMessage(Diagnostic.Kind kind, CharSequence msg) {

            }

            @Override
            public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e) {

            }

            @Override
            public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a) {

            }

            @Override
            public void printMessage(Diagnostic.Kind kind, CharSequence msg, Element e, AnnotationMirror a, AnnotationValue v) {

            }
        };
    }
}
