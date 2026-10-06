-- 1. Create Manger table
CREATE TABLE Manger (
    id          NUMBER(5),
    name        VARCHAR2(50),
    age         NUMBER(2),
    birth_date  DATE,
    address     VARCHAR2(20)
);
SELECT * FROM Manger;

-- 2. Drop address column
ALTER TABLE Manger DROP (address);
SELECT * FROM Manger;

-- 3. Add city_address and street columns
ALTER TABLE Manger ADD (
    city_address  VARCHAR2(50),
    street        VARCHAR2(50)
);
SELECT * FROM Manger;

-- 4. Rename column name to full_name
ALTER TABLE Manger RENAME COLUMN name TO full_name;
SELECT * FROM Manger;

-- 5. Make the table read-only
ALTER TABLE Manger READ ONLY;
DELETE FROM Manger;  -- not allowed: table is read-only

-- 6. Create Owner from Manger (id, name, birth_date)
CREATE TABLE Owner (id, name, birth_date) AS
SELECT id, full_name, birth_date FROM Manger;
SELECT * FROM Owner;

-- 7. Rename Manger to Master
ALTER TABLE Manger RENAME TO Master;
SELECT * FROM Master;

-- 8. Drop all tables
DROP TABLE Master;
DROP TABLE Owner;
