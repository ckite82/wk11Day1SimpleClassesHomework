public class WaterBottle {
    private Integer volume;

    public WaterBottle(Integer volume){
        this.volume = volume;
    }

    public Object getVolume() {
        return this.volume;
    }

    public int getVolumeAfterDrink() {
        return this.volume - 10;
    }

    public int getVolumeAfterEmptied() {
        return getVolumeAfterDrink() - 90;
    }

    public int getVolumeAfterFilling() {
        return getVolumeAfterEmptied() + 100;
    }
}

//    Create a water bottle class with a volume property.
//        The volume should start at 100.
//        Add a drink function that takes 10 from the volume each time it is called.
//        Create an empty function that brings the volume down to 0.
//        Create a fill function that fills the volume back to 100.

