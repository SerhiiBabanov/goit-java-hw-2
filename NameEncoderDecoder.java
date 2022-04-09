class NameEncoderDecoder{
    public String encode(String name){
     return "NOTFORYOU" + name.
         replace("e","1"). 
         replace("u","2"). 
         replace("t","3"). 
         replace("o","4"). 
         replace("a","5") 
       + "YESNOTFORYOU";
    }
    public String decode(String name){
    return name.substring(0,name.lastIndexOf("YESNOTFORYOU")).replaceFirst("NOTFORYOU","").
         replace("1","e"). 
         replace("2","u"). 
         replace("3","t"). 
         replace("4","o"). 
         replace("5","a"); 
    }
}
