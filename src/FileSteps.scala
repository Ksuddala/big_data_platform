
Object FileSteps{
  
def loadFile(path: String,sep: String,header: boolean): Dataframe = {
    val dataframe = spark
                .read
                .option(“sep”,”,”)
                .option(“header” ,false)
                .csv(path)  
       
     dataframe
} 

  }

