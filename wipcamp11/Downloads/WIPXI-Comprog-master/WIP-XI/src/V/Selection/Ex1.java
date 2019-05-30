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
package V.Selection;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Price");
        int price = input.nextInt();

        System.out.println("Do you have member card");
        boolean a = input.nextBoolean();

        System.out.println("Do you want to pay by cash");
        boolean b = input.nextBoolean();

        if (a && b) {
            price = price * 95 / 100;
            price = price * 90 / 100;
            System.out.println("Price=   " + price);

        } else if (b) {
            price = price * 90 / 100;
            System.out.println("Price=   " + price);
        } else if (a) {
            price = price * 95 / 100;
            System.out.println("Price=   " + price);
        }
        else{
        System.out.println(price);
        
        }
        System.out.println(a);
         System.out.println(b);
       
}
