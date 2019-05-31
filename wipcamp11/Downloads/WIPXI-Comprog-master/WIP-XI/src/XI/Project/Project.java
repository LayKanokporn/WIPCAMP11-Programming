/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class Project {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int item = 0, limit = 10;
        System.out.println("item :" + item);
        System.out.println("limit :" + limit);
        System.out.println("Choose menu 1.Add 2.Remove 3.Chek");
        System.out.print("MENU:");
        int menu = sc.nextInt();

        if (menu == 1) {
            if (item > limit) {
                System.out.println("Full");

            } else {
                System.out.print("Amount:");
                int amount = sc.nextInt();

                item = item + amount;

                System.out.println("item :" + item);
                System.out.println("limit :" + limit);
            }

        } else if (menu == 2) {
            if (item == 0) {
                System.out.println("item is none");

            } else {
                System.out.println("Enter amount of item");
                int amount = sc.nextInt();
                if (item >= amount) {
                    item = item - amount;
                    System.out.println("item:" + item);
                    System.out.println("limit :" + limit);
                } else {
                    System.out.println("CAN NOT REMOVE");
                }

            }

        } else if (menu == 3) {
            System.out.println("item:" + item);
            System.out.println("limit :" + limit);
        }

    }

}
