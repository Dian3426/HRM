--------------------------------------------------------
--  文件已创建 - 星期二-九月-22-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence CHANGE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "CHANGE_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence HISTORY_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "HISTORY_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence LEAVE_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "LEAVE_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence MANAGER_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "MANAGER_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence OCCUPATIONCAREER_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "OCCUPATIONCAREER_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence SEQ_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_ID"  MINVALUE 1 MAXVALUE 99999999 INCREMENT BY 1 START WITH 1 NOCACHE  ORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence SKDEPT_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SKDEPT_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 15 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence SKEMP_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SKEMP_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence SKJOB_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SKJOB_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 6 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence SKSTAFF_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SKSTAFF_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence SOCIETYRELATION_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "SOCIETYRELATION_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence TALENT_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "TALENT_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Sequence TEMPORARY_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "TEMPORARY_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE  NOPARTITION
/
--------------------------------------------------------
--  DDL for Table CHANGE
--------------------------------------------------------

  CREATE TABLE "CHANGE" ("ID" NUMBER(*,0), "EMP_ID" VARCHAR2(10 BYTE), "OLDDEPT" VARCHAR2(20 BYTE), "NEWDEPT" VARCHAR2(20 BYTE), "CHANGREASON" VARCHAR2(20 BYTE), "OLDJOB" VARCHAR2(20 BYTE), "NEWJOB" VARCHAR2(20 BYTE), "TYPE" VARCHAR2(20 BYTE), "CHANGTIME" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table HISTORY
--------------------------------------------------------

  CREATE TABLE "HISTORY" ("ID" NUMBER(*,0), "DEPT_ID" VARCHAR2(10 BYTE), "JOB_ID" VARCHAR2(10 BYTE), "TYPE" VARCHAR2(20 BYTE), "PEOPLENUM" NUMBER(*,0), "CHANGETIME" VARCHAR2(20 BYTE), "OLDNUM" NUMBER(*,0), "NEWNUM" NUMBER(*,0), "MANGERNAME" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table LEAVE
--------------------------------------------------------

  CREATE TABLE "LEAVE" ("ID" NUMBER(*,0), "EMP_ID" VARCHAR2(10 BYTE), "JOB_ID" VARCHAR2(10 BYTE), "PLACE" VARCHAR2(20 BYTE), "TIME" VARCHAR2(20 BYTE), "REASON" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table MANAGER
--------------------------------------------------------

  CREATE TABLE "MANAGER" ("ID" NUMBER(*,0), "NAME" VARCHAR2(20 BYTE), "PASS" VARCHAR2(32 BYTE))
/
--------------------------------------------------------
--  DDL for Table OCCUPATIONCAREER
--------------------------------------------------------

  CREATE TABLE "OCCUPATIONCAREER" ("ID" NUMBER(*,0), "BEGINTIME" VARCHAR2(20 BYTE), "ENDTIME" VARCHAR2(20 BYTE), "JOBNAME" VARCHAR2(50 BYTE), "JOBDISCRIP" VARCHAR2(1000 BYTE), "POSITION" VARCHAR2(100 BYTE), "SALARY" NUMBER, "REFERENCE" VARCHAR2(100 BYTE), "REFERENCETEL" VARCHAR2(50 BYTE), "REFERENCEPOSITION" VARCHAR2(100 BYTE), "EMP_ID" VARCHAR2(10 BYTE))
/
--------------------------------------------------------
--  DDL for Table SKDEPT
--------------------------------------------------------

  CREATE TABLE "SKDEPT" ("ID" NUMBER(*,0), "DEPT_ID" VARCHAR2(10 BYTE), "NAME" VARCHAR2(20 BYTE), "TYPE" VARCHAR2(20 BYTE), "TELE" VARCHAR2(20 BYTE), "FAX" VARCHAR2(20 BYTE), "DISCRIP" VARCHAR2(50 BYTE), "SUPERD" VARCHAR2(10 BYTE), "CREATETIME" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table SKEMP
--------------------------------------------------------

  CREATE TABLE "SKEMP" ("ID" NUMBER(*,0), "EMP_ID" VARCHAR2(10 BYTE), "NAME" VARCHAR2(50 BYTE), "SEX" VARCHAR2(10 BYTE), "BIR" VARCHAR2(20 BYTE), "IDCARD" VARCHAR2(30 BYTE), "TOWORKTIME" VARCHAR2(20 BYTE), "ZZMM" VARCHAR2(20 BYTE), "NATIONAL" VARCHAR2(20 BYTE), "NATIV" VARCHAR2(20 BYTE), "TELE" VARCHAR2(20 BYTE), "MAIL" VARCHAR2(30 BYTE), "HEIGHT" VARCHAR2(20 BYTE), "BLOODTYPE" VARCHAR2(10 BYTE), "BIRTHPLACE" VARCHAR2(50 BYTE), "HKPLACE" VARCHAR2(50 BYTE), "DEGREE" VARCHAR2(20 BYTE), "GRADUATESCHOOL" VARCHAR2(50 BYTE), "PROFESSIONAL" VARCHAR2(50 BYTE), "GRADUATETIME" VARCHAR2(20 BYTE), "SOURCE" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table SKJOB
--------------------------------------------------------

  CREATE TABLE "SKJOB" ("ID" NUMBER(*,0), "NAME" VARCHAR2(20 BYTE), "JOB_ID" VARCHAR2(10 BYTE), "TYPE" VARCHAR2(20 BYTE), "LIMITNUM" VARCHAR2(10 BYTE), "DEPT_ID" VARCHAR2(10 BYTE), "ISLIMIT" VARCHAR2(10 BYTE))
/
--------------------------------------------------------
--  DDL for Table SKSTAFF
--------------------------------------------------------

  CREATE TABLE "SKSTAFF" ("ID" NUMBER(*,0), "EMP_ID" VARCHAR2(10 BYTE), "JOB_ID" VARCHAR2(10 BYTE), "TIME" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table SOCIETYRELATION
--------------------------------------------------------

  CREATE TABLE "SOCIETYRELATION" ("ID" NUMBER(*,0), "RELATION" VARCHAR2(20 BYTE), "NAME" VARCHAR2(20 BYTE), "JOB" VARCHAR2(20 BYTE), "POSI" VARCHAR2(20 BYTE), "TEL" VARCHAR2(20 BYTE), "EMP_ID" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table TALENT
--------------------------------------------------------

  CREATE TABLE "TALENT" ("ID" NUMBER(*,0), "EMP_ID" VARCHAR2(10 BYTE), "JOB_ID" VARCHAR2(10 BYTE), "STATUS" VARCHAR2(20 BYTE))
/
--------------------------------------------------------
--  DDL for Table TEMPORARY
--------------------------------------------------------

  CREATE TABLE "TEMPORARY" ("ID" NUMBER(*,0), "EMP_ID" VARCHAR2(10 BYTE), "JOB_ID" VARCHAR2(10 BYTE), "BEGINTIME" VARCHAR2(20 BYTE), "ENDTIME" VARCHAR2(20 BYTE), "STATUS" VARCHAR2(10 BYTE))
/
REM INSERTING into CHANGE
SET DEFINE OFF;
REM INSERTING into HISTORY
SET DEFINE OFF;
REM INSERTING into LEAVE
SET DEFINE OFF;
REM INSERTING into MANAGER
SET DEFINE OFF;
REM INSERTING into OCCUPATIONCAREER
SET DEFINE OFF;
REM INSERTING into SKDEPT
SET DEFINE OFF;
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (9,'1','总公司','Enterprice','2176003','64275080','行政管理',null,'1997-08-06');
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (10,'2','行政部','Enterprice','2176003','64275080','行政管理','0','1997-08-06');
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (11,'3','生产部','Enterprice','64275087','64275084','产品生产','1','1997-08-06');
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (8,'0','总经办','Enterprice','2176004','64275060','行政管理',null,'1997-08-06');
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (12,'4','技术部','Dept','2176003','64275080','技术设计','3','1997-08-06');
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (13,'5','销售部','Dept','2176003','64275080','市场销售','3','1997-08-06');
Insert into SKDEPT (ID,DEPT_ID,NAME,TYPE,TELE,FAX,DISCRIP,SUPERD,CREATETIME) values (14,'6','财务部','Dept','2176003','64275080','财务','2','1997-08-06');
REM INSERTING into SKEMP
SET DEFINE OFF;
REM INSERTING into SKJOB
SET DEFINE OFF;
Insert into SKJOB (ID,NAME,JOB_ID,TYPE,LIMITNUM,DEPT_ID,ISLIMIT) values (1,'行政总监','1','Manage','3','2','Yes');
Insert into SKJOB (ID,NAME,JOB_ID,TYPE,LIMITNUM,DEPT_ID,ISLIMIT) values (2,'行政主管','2','Manage','10','4','Yes');
Insert into SKJOB (ID,NAME,JOB_ID,TYPE,LIMITNUM,DEPT_ID,ISLIMIT) values (3,'技术开发','3','Technology','40','4','No');
Insert into SKJOB (ID,NAME,JOB_ID,TYPE,LIMITNUM,DEPT_ID,ISLIMIT) values (4,'销售总监','4','Marketing','30','5','No');
Insert into SKJOB (ID,NAME,JOB_ID,TYPE,LIMITNUM,DEPT_ID,ISLIMIT) values (5,'财务总管','5','Market','10','6','Yes');
REM INSERTING into SKSTAFF
SET DEFINE OFF;
REM INSERTING into SOCIETYRELATION
SET DEFINE OFF;
REM INSERTING into TALENT
SET DEFINE OFF;
REM INSERTING into TEMPORARY
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index CHANGE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "CHANGE_PK" ON "CHANGE" ("ID")
/
--------------------------------------------------------
--  DDL for Index HISTORY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HISTORY_PK" ON "HISTORY" ("ID")
/
--------------------------------------------------------
--  DDL for Index LEAVE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "LEAVE_PK" ON "LEAVE" ("ID")
/
--------------------------------------------------------
--  DDL for Index MANAGER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "MANAGER_PK" ON "MANAGER" ("ID")
/
--------------------------------------------------------
--  DDL for Index MANAGER_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "MANAGER_UK1" ON "MANAGER" ("NAME")
/
--------------------------------------------------------
--  DDL for Index OCCUPATIONCAREER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "OCCUPATIONCAREER_PK" ON "OCCUPATIONCAREER" ("ID")
/
--------------------------------------------------------
--  DDL for Index SKDEPT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKDEPT_PK" ON "SKDEPT" ("ID")
/
--------------------------------------------------------
--  DDL for Index SKDEPT_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKDEPT_UK1" ON "SKDEPT" ("DEPT_ID")
/
--------------------------------------------------------
--  DDL for Index SKDEPT_UK2
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKDEPT_UK2" ON "SKDEPT" ("NAME")
/
--------------------------------------------------------
--  DDL for Index SKEMP_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKEMP_PK" ON "SKEMP" ("ID")
/
--------------------------------------------------------
--  DDL for Index SKEMP_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKEMP_UK1" ON "SKEMP" ("EMP_ID")
/
--------------------------------------------------------
--  DDL for Index SKEMP_UK2
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKEMP_UK2" ON "SKEMP" ("IDCARD")
/
--------------------------------------------------------
--  DDL for Index SKJOB_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKJOB_PK" ON "SKJOB" ("ID")
/
--------------------------------------------------------
--  DDL for Index SKJOB_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKJOB_UK1" ON "SKJOB" ("JOB_ID")
/
--------------------------------------------------------
--  DDL for Index SKSTAFF_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SKSTAFF_PK" ON "SKSTAFF" ("ID")
/
--------------------------------------------------------
--  DDL for Index SOCIETYRELATION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SOCIETYRELATION_PK" ON "SOCIETYRELATION" ("ID")
/
--------------------------------------------------------
--  DDL for Index TALENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "TALENT_PK" ON "TALENT" ("ID")
/
--------------------------------------------------------
--  DDL for Index TEMPORARY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "TEMPORARY_PK" ON "TEMPORARY" ("ID")
/
--------------------------------------------------------
--  Constraints for Table CHANGE
--------------------------------------------------------

  ALTER TABLE "CHANGE" ADD CONSTRAINT "CHANGE_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "CHANGE" MODIFY ("CHANGTIME" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("TYPE" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("NEWJOB" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("OLDJOB" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("CHANGREASON" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("NEWDEPT" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("OLDDEPT" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "CHANGE" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table HISTORY
--------------------------------------------------------

  ALTER TABLE "HISTORY" MODIFY ("MANGERNAME" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("TYPE" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("JOB_ID" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" ADD CONSTRAINT "HISTORY_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "HISTORY" MODIFY ("NEWNUM" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("OLDNUM" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("CHANGETIME" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("PEOPLENUM" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("DEPT_ID" NOT NULL ENABLE)
  ALTER TABLE "HISTORY" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table LEAVE
--------------------------------------------------------

  ALTER TABLE "LEAVE" ADD CONSTRAINT "LEAVE_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "LEAVE" MODIFY ("REASON" NOT NULL ENABLE)
  ALTER TABLE "LEAVE" MODIFY ("TIME" NOT NULL ENABLE)
  ALTER TABLE "LEAVE" MODIFY ("PLACE" NOT NULL ENABLE)
  ALTER TABLE "LEAVE" MODIFY ("JOB_ID" NOT NULL ENABLE)
  ALTER TABLE "LEAVE" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "LEAVE" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table MANAGER
--------------------------------------------------------

  ALTER TABLE "MANAGER" ADD CONSTRAINT "MANAGER_UK1" UNIQUE ("NAME") USING INDEX  ENABLE
  ALTER TABLE "MANAGER" ADD CONSTRAINT "MANAGER_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "MANAGER" MODIFY ("PASS" NOT NULL ENABLE)
  ALTER TABLE "MANAGER" MODIFY ("NAME" NOT NULL ENABLE)
  ALTER TABLE "MANAGER" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table OCCUPATIONCAREER
--------------------------------------------------------

  ALTER TABLE "OCCUPATIONCAREER" ADD CONSTRAINT "OCCUPATIONCAREER_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("REFERENCEPOSITION" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("REFERENCE" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("SALARY" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("POSITION" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("JOBDISCRIP" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("JOBNAME" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("ENDTIME" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("BEGINTIME" NOT NULL ENABLE)
  ALTER TABLE "OCCUPATIONCAREER" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table SKDEPT
--------------------------------------------------------

  ALTER TABLE "SKDEPT" ADD CONSTRAINT "SKDEPT_UK2" UNIQUE ("NAME") USING INDEX  ENABLE
  ALTER TABLE "SKDEPT" ADD CONSTRAINT "SKDEPT_UK1" UNIQUE ("DEPT_ID") USING INDEX  ENABLE
  ALTER TABLE "SKDEPT" ADD CONSTRAINT "SKDEPT_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "SKDEPT" MODIFY ("CREATETIME" NOT NULL ENABLE)
  ALTER TABLE "SKDEPT" MODIFY ("FAX" NOT NULL ENABLE)
  ALTER TABLE "SKDEPT" MODIFY ("TELE" NOT NULL ENABLE)
  ALTER TABLE "SKDEPT" MODIFY ("TYPE" NOT NULL ENABLE)
  ALTER TABLE "SKDEPT" MODIFY ("NAME" NOT NULL ENABLE)
  ALTER TABLE "SKDEPT" MODIFY ("DEPT_ID" NOT NULL ENABLE)
  ALTER TABLE "SKDEPT" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table SKEMP
--------------------------------------------------------

  ALTER TABLE "SKEMP" MODIFY ("SOURCE" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" ADD CONSTRAINT "SKEMP_UK2" UNIQUE ("IDCARD") USING INDEX  ENABLE
  ALTER TABLE "SKEMP" ADD CONSTRAINT "SKEMP_UK1" UNIQUE ("EMP_ID") USING INDEX  ENABLE
  ALTER TABLE "SKEMP" ADD CONSTRAINT "SKEMP_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "SKEMP" MODIFY ("ZZMM" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("TOWORKTIME" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("IDCARD" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("BIR" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("SEX" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("NAME" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "SKEMP" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table SKJOB
--------------------------------------------------------

  ALTER TABLE "SKJOB" MODIFY ("ISLIMIT" NOT NULL ENABLE)
  ALTER TABLE "SKJOB" ADD CONSTRAINT "SKJOB_UK1" UNIQUE ("JOB_ID") USING INDEX  ENABLE
  ALTER TABLE "SKJOB" ADD CONSTRAINT "SKJOB_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "SKJOB" MODIFY ("DEPT_ID" NOT NULL ENABLE)
  ALTER TABLE "SKJOB" MODIFY ("LIMITNUM" NOT NULL ENABLE)
  ALTER TABLE "SKJOB" MODIFY ("TYPE" NOT NULL ENABLE)
  ALTER TABLE "SKJOB" MODIFY ("JOB_ID" NOT NULL ENABLE)
  ALTER TABLE "SKJOB" MODIFY ("NAME" NOT NULL ENABLE)
  ALTER TABLE "SKJOB" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table SKSTAFF
--------------------------------------------------------

  ALTER TABLE "SKSTAFF" ADD CONSTRAINT "SKSTAFF_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "SKSTAFF" MODIFY ("TIME" NOT NULL ENABLE)
  ALTER TABLE "SKSTAFF" MODIFY ("JOB_ID" NOT NULL ENABLE)
  ALTER TABLE "SKSTAFF" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "SKSTAFF" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table SOCIETYRELATION
--------------------------------------------------------

  ALTER TABLE "SOCIETYRELATION" ADD CONSTRAINT "SOCIETYRELATION_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "SOCIETYRELATION" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "SOCIETYRELATION" MODIFY ("TEL" NOT NULL ENABLE)
  ALTER TABLE "SOCIETYRELATION" MODIFY ("NAME" NOT NULL ENABLE)
  ALTER TABLE "SOCIETYRELATION" MODIFY ("RELATION" NOT NULL ENABLE)
  ALTER TABLE "SOCIETYRELATION" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table TALENT
--------------------------------------------------------

  ALTER TABLE "TALENT" ADD CONSTRAINT "TALENT_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "TALENT" MODIFY ("STATUS" NOT NULL ENABLE)
  ALTER TABLE "TALENT" MODIFY ("JOB_ID" NOT NULL ENABLE)
  ALTER TABLE "TALENT" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "TALENT" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Constraints for Table TEMPORARY
--------------------------------------------------------

  ALTER TABLE "TEMPORARY" ADD CONSTRAINT "TEMPORARY_PK" PRIMARY KEY ("ID") USING INDEX  ENABLE
  ALTER TABLE "TEMPORARY" MODIFY ("STATUS" NOT NULL ENABLE)
  ALTER TABLE "TEMPORARY" MODIFY ("ENDTIME" NOT NULL ENABLE)
  ALTER TABLE "TEMPORARY" MODIFY ("BEGINTIME" NOT NULL ENABLE)
  ALTER TABLE "TEMPORARY" MODIFY ("JOB_ID" NOT NULL ENABLE)
  ALTER TABLE "TEMPORARY" MODIFY ("EMP_ID" NOT NULL ENABLE)
  ALTER TABLE "TEMPORARY" MODIFY ("ID" NOT NULL ENABLE)
/
--------------------------------------------------------
--  Ref Constraints for Table CHANGE
--------------------------------------------------------

  ALTER TABLE "CHANGE" ADD CONSTRAINT "CHANGE_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table HISTORY
--------------------------------------------------------

  ALTER TABLE "HISTORY" ADD CONSTRAINT "HISTORY_SKDEPT_FK1" FOREIGN KEY ("DEPT_ID") REFERENCES "SKDEPT" ("DEPT_ID") ENABLE
  ALTER TABLE "HISTORY" ADD CONSTRAINT "HISTORY_SKJOB_FK1" FOREIGN KEY ("JOB_ID") REFERENCES "SKJOB" ("JOB_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table LEAVE
--------------------------------------------------------

  ALTER TABLE "LEAVE" ADD CONSTRAINT "LEAVE_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
  ALTER TABLE "LEAVE" ADD CONSTRAINT "LEAVE_SKJOB_FK1" FOREIGN KEY ("JOB_ID") REFERENCES "SKJOB" ("JOB_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table OCCUPATIONCAREER
--------------------------------------------------------

  ALTER TABLE "OCCUPATIONCAREER" ADD CONSTRAINT "OCCUPATIONCAREER_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table SKDEPT
--------------------------------------------------------

  ALTER TABLE "SKDEPT" ADD CONSTRAINT "SKDEPT_SKDEPT_FK1" FOREIGN KEY ("SUPERD") REFERENCES "SKDEPT" ("DEPT_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table SKJOB
--------------------------------------------------------

  ALTER TABLE "SKJOB" ADD CONSTRAINT "SKJOB_SKDEPT_FK1" FOREIGN KEY ("DEPT_ID") REFERENCES "SKDEPT" ("DEPT_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table SKSTAFF
--------------------------------------------------------

  ALTER TABLE "SKSTAFF" ADD CONSTRAINT "SKSTAFF_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
  ALTER TABLE "SKSTAFF" ADD CONSTRAINT "SKSTAFF_SKJOB_FK1" FOREIGN KEY ("JOB_ID") REFERENCES "SKJOB" ("JOB_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table SOCIETYRELATION
--------------------------------------------------------

  ALTER TABLE "SOCIETYRELATION" ADD CONSTRAINT "SOCIETYRELATION_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table TALENT
--------------------------------------------------------

  ALTER TABLE "TALENT" ADD CONSTRAINT "TALENT_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
  ALTER TABLE "TALENT" ADD CONSTRAINT "TALENT_SKJOB_FK1" FOREIGN KEY ("JOB_ID") REFERENCES "SKJOB" ("JOB_ID") ENABLE
/
--------------------------------------------------------
--  Ref Constraints for Table TEMPORARY
--------------------------------------------------------

  ALTER TABLE "TEMPORARY" ADD CONSTRAINT "TEMPORARY_SKEMP_FK1" FOREIGN KEY ("EMP_ID") REFERENCES "SKEMP" ("EMP_ID") ENABLE
  ALTER TABLE "TEMPORARY" ADD CONSTRAINT "TEMPORARY_SKJOB_FK1" FOREIGN KEY ("JOB_ID") REFERENCES "SKJOB" ("JOB_ID") ENABLE
/
--------------------------------------------------------
--  DDL for Trigger CHANGE_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "CHANGE_TRG" BEFORE INSERT ON CHANGE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT CHANGE_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "CHANGE_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger HISTORY_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "HISTORY_TRG" BEFORE INSERT ON HISTORY 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT HISTORY_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "HISTORY_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger LEAVE_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "LEAVE_TRG" BEFORE INSERT ON LEAVE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT LEAVE_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "LEAVE_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger MANAGER_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "MANAGER_TRG" BEFORE INSERT ON MANAGER 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT MANAGER_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "MANAGER_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger OCCUPATIONCAREER_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "OCCUPATIONCAREER_TRG" BEFORE INSERT ON OCCUPATIONCAREER 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT OCCUPATIONCAREER_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "OCCUPATIONCAREER_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger SKDEPT_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SKDEPT_TRG" BEFORE INSERT ON SKDEPT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT SKDEPT_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "SKDEPT_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger SKEMP_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SKEMP_TRG" BEFORE INSERT ON SKEMP 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT SKEMP_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "SKEMP_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger SKJOB_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SKJOB_TRG" BEFORE INSERT ON SKJOB 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT SKJOB_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "SKJOB_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger SKSTAFF_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SKSTAFF_TRG" BEFORE INSERT ON SKSTAFF 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID = NULL THEN
      SELECT SKSTAFF_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "SKSTAFF_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger SOCIETYRELATION_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SOCIETYRELATION_TRG" BEFORE INSERT ON SOCIETYRELATION 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT SOCIETYRELATION_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "SOCIETYRELATION_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger TALENT_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "TALENT_TRG" BEFORE INSERT ON TALENT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT TALENT_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "TALENT_TRG" ENABLE
/
--------------------------------------------------------
--  DDL for Trigger TEMPORARY_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "TEMPORARY_TRG" BEFORE INSERT ON TEMPORARY 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID = NULL THEN
      SELECT TEMPORARY_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
ALTER TRIGGER "TEMPORARY_TRG" ENABLE
/
