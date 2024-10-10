package Task3;

import java.util.ArrayList;

public class MainTask3 {
    public static void main(String[]args){
        Room myRoom1 = new Room(4,5);
        Room myRoom2 = new Room(2, 6);
        Room myRoom3 = new Room(8,1);

        ArrayList<Room> roomArr = new ArrayList<>();
        roomArr.add(myRoom1);
        roomArr.add(myRoom2);
        roomArr.add(myRoom3);

        Building myBuilding1 = new Building(roomArr, 3);
        System.out.println(countWindowsInBuilding(myBuilding1));
        System.out.println(countLampsInBuilding(myBuilding1));
        System.out.println(countFloorsInBuilding(myBuilding1));
    }

    public static int countWindowsInBuilding(Building buildingBuilding)    {
        int sum = 0;
        for (Room room: buildingBuilding.getRooms())    {
            sum += room.getNumberOfWindows();
        }
        return sum;
    }

    public static int countLampsInBuilding(Building buildingBuilding)    {
        int sum = 0;
        for (Room room: buildingBuilding.getRooms())    {
            sum += room.getNumberOfLamps();
        }
        return sum;
    }
    public static int countFloorsInBuilding(Building buildingBuilding)    {
        return buildingBuilding.getNumberOfFloors();
    }
}
