package com.hospital.dao;

import java.util.List;

import com.hospital.pojo.Room;

public interface RoomDao {
  boolean addRoom(Room room);
  List<Room> showAllRoom();
  List<Room> searchRoomByRoomType(String room_type);
}
