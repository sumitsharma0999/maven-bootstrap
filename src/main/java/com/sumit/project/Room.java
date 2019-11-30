package com.sumit.project;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Room {
    private final int length;
    private final int breadth;

    public int area() {
        return length*breadth;
    }
}
