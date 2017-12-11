/**
 *  day class is a class to get a day of a week
 */
public class day {

    private String[] day=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    int index;

    public day(String day){
        int i=indexofday(day);
        if(i!=7){
            this.index=i;
        }
    }

    private int indexofday(String day){
       int i=0;
        while(i<this.day.length){
            if(this.day[i].equals(day)){
                return i;
            }
            i++;
        }
        return i;
    }

    /**
     * set the day
     * @param day
     */
    public void setDay(String day){
        int i=indexofday(day);
        if(i!=7){
            this.index=i;
        }
    }

    /**
     * "It is "+day+" ."
     * @return
     */
    public String toString() {
        return "It is "+day[this.index]+" .";
    }

    /**
     * get the day
     * @return
     */
    public String getDay(){
        return day[this.index];
    }

    /**
     * get the day of previous day
     * @return
     */
    public String previousDay(){
        String result;
        if(index==0){
            result=day[6];
        }
        else result=day[index-1];
        return result;
    }

    /**
     * get the day of next day
     * @return
     */
    public String nextDay(){
        String result;
        if(index==6){
            result=day[0];
        }
        else result=day[index+1];
        return result;
    }

    /**
     * add n days to day
     * @param n
     * @return
     */
    public String addDays(int n){
        String result;
        int m=index+n;
        return result=day[m%7];
    }

}

