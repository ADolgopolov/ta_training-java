package com.epam.training.student_andrii_dolhopolov.wrapper_classes.battleship8x8;

import java.util.List;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public char[] longToCharArray(long value) {
        return String.format("%64s", Long.toBinaryString(value)).replace(' ', '0').toCharArray();
    }
    public boolean shoot(String shot) {
        long start_state = 0b1111111111111111111111111111111111111111111111111111111111111111L;

        char[] coordinate = shot.toCharArray();
        int column =  coordinate[0] - 'A';
        int row = coordinate[1] - '1';

        int position = 8*row + column;
        this.shots = this.shots | ((start_state>>>position) & (start_state << 63-position));
        return longToCharArray(this.ships)[position] == '1';
    }

    public String state() {
        char [] ships_char_array = longToCharArray(ships);
        char [] shots_char_array = longToCharArray(shots);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < ships_char_array.length; i++) {
            if (ships_char_array[i]=='0' && shots_char_array[i]=='0') {
                builder.append(".");
            } else if (ships_char_array[i]=='0' && shots_char_array[i]=='1') {
                builder.append("×");
            } else if (ships_char_array[i]=='1' && shots_char_array[i]=='0') {
                builder.append("☐");
            } else {
                builder.append("☒");
            }
            if (i < ships_char_array.length-1 && (i+1) % 8 == 0) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        //
        long map = 0b11110000_00000111_00000000_00110000_00000010_01000000_00000000_00000000L;
        Battleship8x8 battle = new Battleship8x8(map);
        List<String> shots = List.of("A1", "B2", "C3", "D4", "E5", "F6", "G7");
        shots.forEach(battle::shoot);
        System.out.println(battle.state());
    }
}
