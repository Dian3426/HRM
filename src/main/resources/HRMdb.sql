alter table "change"
   drop constraint FK_CHANGE_REFERENCE_SKDEPT;

alter table "change"
   drop constraint FK_CHANGE_REFERENCE_SKDEPT;

alter table "history"
   drop constraint FK_HISTORY_REFERENCE_SKDEPT;

alter table "history"
   drop constraint FK_HISTORY_REFERENCE_SKJOB;

alter table "leave"
   drop constraint FK_LEAVE_REFERENCE_SKJOB;

alter table "leave"
   drop constraint FK_LEAVE_REFERENCE_SKEMP;

alter table "occupationcareer"
   drop constraint FK_OCCUPATI_REFERENCE_SKEMP;

alter table "skemp"
   drop constraint FK_SKEMP_REFERENCE_OCCUPATI;

alter table "skstaff"
   drop constraint FK_SKSTAFF_REFERENCE_SKEMP;

alter table "skstaff"
   drop constraint FK_SKSTAFF_REFERENCE_SKJOB;

alter table "societyrelation"
   drop constraint FK_SOCIETYR_REFERENCE_SKEMP;

alter table "temporary"
   drop constraint FK_TEMPORAR_REFERENCE_SKEMP;

alter table "temporary"
   drop constraint FK_TEMPORAR_REFERENCE_SKJOB;

drop table "change" cascade constraints;

drop table "history" cascade constraints;

drop table "leave" cascade constraints;

drop table "manager" cascade constraints;

drop table "matable" cascade constraints;

drop table "occupationcareer" cascade constraints;

drop table "skdept" cascade constraints;

drop table "skemp" cascade constraints;

drop table "skjob" cascade constraints;

drop table "skstaff" cascade constraints;

drop table "societyrelation" cascade constraints;

drop table "talent" cascade constraints;

drop table "temporary" cascade constraints;

/*==============================================================*/
/* Table: "change"                                              */
/*==============================================================*/
create table "change" 
(
   "id"                 VARCHAR2(10)         not null,
   "be_dept_id"         VARCHAR2(10)         not null,
   "af_dept_id"         VARCHAR2(10)         not null,
   "deptype"            VARCHAR2(20)         not null,
   "deptreason"         VARCHAR2(20),
   "depttime"           VARCHAR2(20)         not null,
   "oldjob"             VARCHAR2(20)         not null,
   "newjob"             VARCHAR2(20)         not null,
   "type"               VARCHAR2(20)         not null,
   "time"               VARCHAR2(20),
   "jobtime"            VARCHAR2(20)         not null,
   constraint PK_CHANGE primary key ("id")
);

/*==============================================================*/
/* Table: "history"                                             */
/*==============================================================*/
create table "history" 
(
   "id"                 VARCHAR2(10)         not null,
   "dept_id"            VARCHAR2(10)         not null,
   "job_id"             VARCHAR2(10)         not null,
   "type"               VARCHAR2(20)         not null,
   "people"             VARCHAR2(10)         not null,
   "changetime"         VARCHAR2(20)         not null,
   "oldpeople"          VARCHAR2(10)         not null,
   "newpeople"          VARCHAR2(10)         not null,
   "name"               VARCHAR2(20)         not null,
   constraint PK_HISTORY primary key ("id")
);

/*==============================================================*/
/* Table: "leave"                                               */
/*==============================================================*/
create table "leave" 
(
   "id"                 VARCHAR2(10)         not null,
   "emp_id"             INTEGER              not null,
   "job_id"             VARCHAR2(10)         not null,
   "place"              VARCHAR2(20)         not null,
   "time"               VARCHAR2(20)         not null,
   "reason"             VARCHAR2(20),
   constraint PK_LEAVE primary key ("id")
);

/*==============================================================*/
/* Table: "manager"                                             */
/*==============================================================*/
create table "manager" 
(
   "id"                 VARCHAR2(10)         not null,
   "name"               VARCHAR2(20)         not null,
   "pass"               VARCHAR2(20)         not null,
   constraint PK_MANAGER primary key ("id")
);

/*==============================================================*/
/* Table: "matable"                                             */
/*==============================================================*/
create table "matable" 
(
   "id"                 VARCHAR2(10)         not null,
   "typeid"             VARCHAR2(20)         not null,
   "value"              VARCHAR2(20)         not null,
   constraint PK_MATABLE primary key ("id")
);

/*==============================================================*/
/* Table: "occupationcareer"                                    */
/*==============================================================*/
create table "occupationcareer" 
(
   "id"                 VARCHAR2(20)         not null,
   "emp_id"             INTEGER,
   "begintime"          VARCHAR2(20)         not null,
   "endtime"            VARCHAR2(20)         not null,
   "jobname"            VARCHAR2(50)         not null,
   "jobdiscrip"         VARCHAR2(1000)       not null,
   "position"           VARCHAR2(100)        not null,
   "salary"             VARCHAR2(20)         not null,
   "reference"          VARCHAR2(100)        not null,
   "referenceposition"  VARCHAR2(100)        not null,
   "referencetel"       VARCHAR2(50)         not null,
   constraint PK_OCCUPATIONCAREER primary key ("id")
);

comment on table "occupationcareer" is
'职业生涯信息';

/*==============================================================*/
/* Table: "skdept"                                              */
/*==============================================================*/
create table "skdept" 
(
   "dept_id"            VARCHAR2(10)         not null,
   "name"               VARCHAR2(20)         not null,
   "type"               VARCHAR2(20)         not null,
   "tele"               VARCHAR2(20)         not null,
   "fax"                VARCHAR2(20)         not null,
   "discrip"            VARCHAR2(20),
   "super"              VARCHAR2(20),
   "createtime"         VARCHAR2(20)         not null,
   constraint PK_SKDEPT primary key ("dept_id")
);

/*==============================================================*/
/* Table: "skemp"                                               */
/*==============================================================*/
create table "skemp" 
(
   "emp_id"             INTEGER              not null,
   "name"               VARCHAR2(50)         not null,
   "sex"                VARCHAR2(10)         not null,
   "bir"                VARCHAR2(30)         not null,
   "idcard"             VARCHAR2(30)         not null,
   "toworktime"         VARCHAR2(30)         not null,
   "zzmm"               VARCHAR2(30)         not null,
   "national"           VARCHAR2(30),
   "native"             VARCHAR2(30),
   "tele"               VARCHAR2(20),
   "mail"               VARCHAR2(30),
   "height"             VARCHAR2(20),
   "bloodtype"          VARCHAR2(10),
   "birthplace"         VARCHAR2(50),
   "hkplace"            VARCHAR2(50),
   "photo"              VARCHAR2(255)        not null,
   "xl"                 VARCHAR2(20),
   "degree"             VARCHAR2(20),
   "graduateschool"     VARCHAR2(50),
   "professional"       VARCHAR2(50),
   "graduatetime"       VARCHAR2(30),
   constraint PK_SKEMP primary key ("emp_id")
);

/*==============================================================*/
/* Table: "skjob"                                               */
/*==============================================================*/
create table "skjob" 
(
   "job_id"             VARCHAR2(10)         not null,
   "name"               VARCHAR2(20)         not null,
   "type"               VARCHAR2(20)         not null,
   "limit"              VARCHAR2(10)         not null,
   "deptno"             VARCHAR2(10)         not null,
   constraint PK_SKJOB primary key ("job_id")
);

/*==============================================================*/
/* Table: "skstaff"                                             */
/*==============================================================*/
create table "skstaff" 
(
   "id"                 VARCHAR2(10)         not null,
   "emp_id"             INTEGER,
   "job_id"             VARCHAR2(10)         not null,
   "time"               VARCHAR2(20)         not null,
   "source"             VARCHAR2(20)         not null,
   constraint PK_SKSTAFF primary key ("id")
);

/*==============================================================*/
/* Table: "societyrelation"                                     */
/*==============================================================*/
create table "societyrelation" 
(
   "id"                 VARCHAR2(20)         not null,
   "emp_id"             INTEGER,
   "relation"                VARCHAR2(20)         not null,
   "name"                  VARCHAR2(20)         not null,
   "job"                 VARCHAR2(20),
   "posi"                   VARCHAR2(20),
   "tel"                 VARCHAR2(20),
   constraint PK_SOCIETYRELATION primary key ("id")
);

/*==============================================================*/
/* Table: "talent"                                              */
/*==============================================================*/
create table "talent" 
(
   "id"                 VARCHAR2(10)         not null,
   "empno"              VARCHAR2(20)         not null,
   "jobid"              VARCHAR2(20)         not null,
   "time"               VARCHAR2(20)         not null,
   constraint PK_TALENT primary key ("id")
);

/*==============================================================*/
/* Table: "temporary"                                           */
/*==============================================================*/
create table "temporary" 
(
   "id"                 VARCHAR2(30)         not null,
   "begintime"          VARCHAR2(20)         not null,
   "endtime"            VARCHAR2(30)         not null,
   "result"             VARCHAR2(30)         not null,
   "dealtime"           VARCHAR2(20)         not null,
   "ope"                VARCHAR2(20)         not null,
   "emp_id"             INTEGER              not null,
   "job_id"             VARCHAR2(10)         not null,
   constraint PK_TEMPORARY primary key ("id")
);


alter table "change"
   add constraint FK_CHANGE_REFERENCE_SKDEPT foreign key ("be_dept_id")
      references "skdept" ("dept_id");

alter table "change"
   add constraint FK_CHANGE_REFERENCE_SKDEPT foreign key ("af_dept_id")
      references "skdept" ("dept_id");

alter table "history"
   add constraint FK_HISTORY_REFERENCE_SKDEPT foreign key ("dept_id")
      references "skdept" ("dept_id");

alter table "history"
   add constraint FK_HISTORY_REFERENCE_SKJOB foreign key ("job_id")
      references "skjob" ("job_id");

alter table "leave"
   add constraint FK_LEAVE_REFERENCE_SKJOB foreign key ("job_id")
      references "skjob" ("job_id");

alter table "leave"
   add constraint FK_LEAVE_REFERENCE_SKEMP foreign key ("emp_id")
      references "skemp" ("emp_id");

alter table "occupationcareer"
   add constraint FK_OCCUPATI_REFERENCE_SKEMP foreign key ("emp_id")
      references "skemp" ("emp_id");

alter table "skstaff"
   add constraint FK_SKSTAFF_REFERENCE_SKEMP foreign key ("emp_id")
      references "skemp" ("emp_id");

alter table "skstaff"
   add constraint FK_SKSTAFF_REFERENCE_SKJOB foreign key ("job_id")
      references "skjob" ("job_id");

alter table "societyrelation"
   add constraint FK_SOCIETYR_REFERENCE_SKEMP foreign key ("emp_id")
      references "skemp" ("emp_id");

alter table "temporary"
   add constraint FK_TEMPORAR_REFERENCE_SKEMP foreign key ("emp_id")
      references "skemp" ("emp_id");

alter table "temporary"
   add constraint FK_TEMPORAR_REFERENCE_SKJOB foreign key ("job_id")
      references "skjob" ("job_id");
