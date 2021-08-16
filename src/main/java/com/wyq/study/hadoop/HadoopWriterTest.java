package com.wyq.study.hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;


public class HadoopWriterTest {

    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        System.setProperty("HADOOP_USER_NAME", "root");
        conf.set("fs.defaultFS", "hdfs://node2:8020");
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path("/tmp/test123");
        fs.create(path);
        fs.close();
    }

}
