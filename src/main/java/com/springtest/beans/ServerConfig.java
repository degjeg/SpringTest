package com.springtest.beans;

import java.util.Properties;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ServerConfig {
    String host;
    short port;

    String user; // =root
    String passwor; // =123456
    String driverclass; // =com.mysql.jdbc.Driver
    String jdbcurl; // =jdbc:mysql:///test

    Properties properties;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public short getPort() {
        return port;
    }

    public void setPort(short port) {
        this.port = port;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswor() {
        return passwor;
    }

    public void setPasswor(String passwor) {
        this.passwor = passwor;
    }

    public String getDriverclass() {
        return driverclass;
    }

    public void setDriverclass(String driverclass) {
        this.driverclass = driverclass;
    }

    public String getJdbcurl() {
        return jdbcurl;
    }

    public void setJdbcurl(String jdbcurl) {
        this.jdbcurl = jdbcurl;
    }

    @Override
    public String toString() {
        return "ServerConfig{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", user='" + user + '\'' +
                ", passwor='" + passwor + '\'' +
                ", driverclass='" + driverclass + '\'' +
                ", jdbcurl='" + jdbcurl + '\'' +
                ", properties=" + properties +
                '}';
    }
}
