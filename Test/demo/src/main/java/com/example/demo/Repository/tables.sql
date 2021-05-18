DROP DATABASE [IF EXISTS] Bank;
CREATE DATABASE Bank;

CREATE TABLE Suppliers (
       id      INT             NOT NULL,
       name  VARCHAR(20)            NOT NULL,
       PRIMARY KEY (id)
);

CREATE TABLE Accounts (
     id     INT  NOT NULL,
     suplier_id   INT NOT NULL,
     account_num VARCHAR(12) NOT NULL,
     amount numeric(15,6) NULL
     PRIMARY KEY (id),
     FOREIGN KEY (suplier_id) REFERENCES Suppliers(id)
);

CREATE TABLE RequestHistories (
      id    INT   NOT NULL,
      supplier_id   INT   NOT NULL,
      account_id    INT   NOT NULL,
      datetime      DATE   NOT NULL,
      amount numeric(15,6) NOT NULL,
      request_type VARCHAR(4) NOT NULL,
      FOREIGN KEY (supplier_id)  REFERENCES Suppliers (id),
      FOREIGN KEY (account_id) REFERENCES Accounts (id),
      PRIMARY KEY (id)
);
