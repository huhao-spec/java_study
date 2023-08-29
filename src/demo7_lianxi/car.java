package demo7_lianxi;

public abstract class car {
     private String name;
     private String color;
     //Laden载货 Manned载人

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getColor() {
          return color;
     }

     public void setColor(String color) {
          this.color = color;
     }

     public car(String name, String color) {
          this.name = name;
          this.color = color;
     }
     public abstract String seatNum();
}
