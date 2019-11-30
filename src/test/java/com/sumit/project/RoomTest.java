package com.sumit.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoomTest {
    @Test
    public void testArea() {
        Room room = new Room(5,6);
        Assertions.assertEquals(30, room.area(), "Areas should be correct");
    }
}
