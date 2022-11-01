class Date{
    private int day,month,year;
    
    public boolean setDay(int d){
        day = d;
    }
    public boolean setMonth(int m){
        month = m;
    }
    public boolean setYear(int y){
        year = y;
    }
    
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year();
    }
    
    //method to validate if this is a leap year, is private because this method only used in this class
    private boolean leapYear(){
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    
    //Method to validate a right date, is public because probably this methos will be used in other class
    public boolean rightDate{
        boolean rightDay,rightMonth,rightYear;
        
        rightYear = year > 0;
        rightMonth = month >= 1 && month <= 12;
     
        //This switch validate the days in their months and the other months included int default case
        switch(mes){ //leap year = año bisiesto
            case 2:
                if(leapyear){
                    rightDay = day >= 1 && day <= 29;
                }else{
                    rightDay = day >= 1 && day <= 28;
                }
                break;
            case 4:
                case 6:
                case 9:
                case 11:
                    rightDay = day >= 1 && day <= 30;
                break;
            default: rigthDay = day >= 1 && day <= 31;
        }
        
        return rightDay && rightMonth && rightYear;
    }
    
    public void nextDay(){
        day++;
        
        if(!rightDate()){
            day = 1;
            month++;
            if(!rightDate()){
                month = 1;
                year ++;
            }
        }
    }
    
    
}
