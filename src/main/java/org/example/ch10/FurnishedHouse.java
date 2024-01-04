package org.example.ch10;

class FurnishedHouse {
    String s = "House";

    class Room {
        String s = "Room";

        class Chair {
            String s = "Chair";

            void print() {
                System.out.println(s);
                System.out.println(this.s);
                System.out.println(Chair.this.s);

                System.out.println(Room.this.s);
                System.out.println(FurnishedHouse.this.s);
            }
        }
    }

    public static void main(String[] args) {
        new FurnishedHouse().new Room().new Chair().print();

        FurnishedHouse h = new FurnishedHouse();
        FurnishedHouse.Room r = h.new Room();
        FurnishedHouse.Room.Chair c = r.new Chair();
        c.print();
    }
}
