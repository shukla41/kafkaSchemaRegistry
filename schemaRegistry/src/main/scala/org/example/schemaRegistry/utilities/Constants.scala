package org.example.schemaRegistry.utilities

object Constants {

    //File System
    val resourceDir = "/home/master/IdeaProjects/schemaRegistry/src/main/resources/"

    val datasetDir = resourceDir + "dataset/"

    val schemaDir = resourceDir + "schema/"

    val sampleDataFile = datasetDir + "sampledata.csv"

    val sampleSchema = schemaDir + "sample.avsc"

    //URLS

    val host_server = "localhost"
    //kafka params
    val kafka_bootstrap_server = host_server + ":9092"

    val kafka_topic = "SchemaRegistryTest1"

    //schema registry params

    val schema_registry_url = "http://" + host_server + ":8081"

    val schema_topic:String = "student"

    val schema_name:String = "samplepeopledata"

    val schema_namespace :String = "io.schemaregistry"

}
