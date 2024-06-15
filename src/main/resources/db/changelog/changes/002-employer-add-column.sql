--liquibase formatted sql

--changeset marcio-paulo:addColumn-role
--comment: important change on table for business
ALTER TABLE employer ADD role VARCHAR(255) NULL;