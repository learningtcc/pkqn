<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd" >
    <parent >
        <artifactId >eccrm</artifactId >
        <groupId >eccrm</groupId >
        <version >1.0.0-SNAPSHOT</version >
        <relativePath >../pom.xml</relativePath >
    </parent >
    <modules >
        <module >${module}-api</module >
        <module >${module}-impl</module >
        <module >${module}-web</module >
    </modules >
    <modelVersion >4.0.0</modelVersion >
    <packaging >pom</packaging >
    <groupId >eccrm</groupId >
    <artifactId >eccrm-${module}</artifactId >

</project >