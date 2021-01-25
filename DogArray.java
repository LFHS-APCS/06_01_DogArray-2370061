public class DogArray
{

    /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
    {
        int index = 0;
        for(int i = 1; i < dogs.length; i++){
          if(dogs[i].getAge() < dogs[index].getAge()){
            index = i;
          }
        }
        return index;
        
       // return -1;
    }

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
      int index = 0;
      String youngestName = "";
      for(int i = 1; i < dogs.length; i++){
        if(dogs[i].getAge() < dogs[index].getAge()){
          youngestName = dogs[i].getName();
        }
      }
        return youngestName;
       // return "";
    }
}
