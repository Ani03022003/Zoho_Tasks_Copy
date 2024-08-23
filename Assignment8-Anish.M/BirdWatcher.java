
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return this.birdsPerDay;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return this.birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        this.birdsPerDay[birdsPerDay.length-1]=this.birdsPerDay[birdsPerDay.length-1]+1;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for(int i=0;i<birdsPerDay.length;i++){
            if(this.birdsPerDay[i]==0)
                    return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        if(numberOfDays>this.birdsPerDay.length){
            System.out.println("Index 7 out of bounds for length 7");
        }
        int countOfBirds=0;
        for(int i=0;i<this.birdsPerDay.length;i++){
            if(i>=numberOfDays)
                break;
            countOfBirds+=this.birdsPerDay[i];
        }
        return countOfBirds;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int busyDayCount=0;
        for(int i=0;i<this.birdsPerDay.length;i++){
            if(this.birdsPerDay[i]>=5)
                busyDayCount++;
        }
        return busyDayCount;
    }
}