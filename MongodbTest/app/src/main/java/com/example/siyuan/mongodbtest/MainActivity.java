package com.example.siyuan.mongodbtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static MongoDatabase mongoDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        try {
//            ServerAddress serverAddress = new ServerAddress("198.199.102.182",27017);
//            ArrayList<ServerAddress> addrs = new ArrayList<ServerAddress>();
//            addrs.add(serverAddress);
//
//            MongoCredential credential = MongoCredential.createScramSha1Credential("admin", "king", "67971127w".toCharArray());
//            ArrayList<MongoCredential> credentials = new ArrayList<MongoCredential>();
//            credentials.add(credential);
//
//            MongoClient mongoClient = new MongoClient(addrs,credentials);
//            mongoDatabase = mongoClient.getDatabase("king");
//        } catch (Exception e) {
//            Log.e(TAG, "Unable to connect to server");
//        }
    }
}
