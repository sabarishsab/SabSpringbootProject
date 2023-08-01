package StreamingExample;

import java.util.Objects;

public class Menu {

    private String iceCreamFlavour;
    private int rate;
    private  String serverName;
    private  int servingTime;


    public String getIceCreamFlavour() {
        return iceCreamFlavour;
    }

    public void setIceCreamFlavour(String iceCreamFlavour) {
        this.iceCreamFlavour = iceCreamFlavour;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getServingTime() {
        return servingTime;
    }

    public void setServingTime(int servingTime) {
        this.servingTime = servingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu menu)) return false;
        return rate == menu.rate && servingTime == menu.servingTime && iceCreamFlavour.equals(menu.iceCreamFlavour) && serverName.equals(menu.serverName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iceCreamFlavour, rate, serverName, servingTime);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "iceCreamFlavour='" + iceCreamFlavour + '\'' +
                ", rate=" + rate +
                ", serverName='" + serverName + '\'' +
                ", servingTime=" + servingTime +
                '}';
    }

    public Menu(String iceCreamFlavour, int rate, String serverName, int servingTime) {
        this.iceCreamFlavour = iceCreamFlavour;
        this.rate = rate;
        this.serverName = serverName;
        this.servingTime = servingTime;
    }
}
