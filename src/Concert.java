public class Concert
{
    private int seats;
    private String address;
    private String time;
    private Band band;

    public Concert(int seats, String address, String time, Band band)
    {
        this.seats = seats;
        this.address = address;
        this.time = time;
        this.band = band;
    }


    public int getSeats()
    {
        return seats;
    }

    public void setSeats(int seats)
    {
        this.seats = seats;
    }

    public String getAddress()
    {
        return address;
    }


    public String getTime()
    {
        return time;
    }

}
