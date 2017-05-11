# --- !Ups
create table "user" ("userID" VARCHAR NOT NULL PRIMARY KEY,"firstName" VARCHAR,"lastName" VARCHAR,"fullName" VARCHAR,"email" VARCHAR,"avatarURL" VARCHAR);
create table "logininfo" ("id" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,"providerID" VARCHAR NOT NULL,"providerKey" VARCHAR NOT NULL);
create table "userlogininfo" ("userID" VARCHAR NOT NULL,"loginInfoId" BIGINT NOT NULL);
create table "passwordinfo" ("hasher" VARCHAR NOT NULL,"password" VARCHAR NOT NULL,"salt" VARCHAR,"loginInfoId" BIGINT NOT NULL);
create table "oauth1info" ("id" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,"token" VARCHAR NOT NULL,"secret" VARCHAR NOT NULL,"loginInfoId" BIGINT NOT NULL);
create table "oauth2info" ("id" BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) NOT NULL PRIMARY KEY,"accesstoken" VARCHAR NOT NULL,"tokentype" VARCHAR,"expiresin" INTEGER,"refreshtoken" VARCHAR,"logininfoid" BIGINT NOT NULL);
create table "openidinfo" ("id" VARCHAR NOT NULL PRIMARY KEY,"logininfoid" BIGINT NOT NULL);
create table "openidattributes" ("id" VARCHAR NOT NULL,"key" VARCHAR NOT NULL,"value" VARCHAR NOT NULL);
create table "foruminfo" ("id" VARCHAR NOT NULL PRIMARY KEY,"userID" VARCHAR NOT NULL ,"title" VARCHAR NOT NULL,"detail" VARCHAR ,"imagepost" VARCHAR,"vdopost" VARCHAR );
create table "comment" ("id" VARCHAR NOT NULL PRIMARY KEY,"detail" VARCHAR,"userID" VARCHAR NOT NULL,"artworkid" VARCHAR NOT NULL,"forumid" VARCHAR NOT NULL );
create table "artwork" ("id" VARCHAR NOT NULL PRIMARY KEY, "userID" VARCHAR NOT NULL , "title" VARCHAR , "detail" VARCHAR , "tags" VARCHAR  , "modelType" VARCHAR )
# --- !Downs

drop table "artwork";
drop table "comment";
drop table "foruminfo";
drop table "openidattributes";
drop table "openidinfo";
drop table "oauth2info";
drop table "oauth1info";
drop table "passwordinfo";
drop table "userlogininfo";
drop table "logininfo";
drop table "user";
