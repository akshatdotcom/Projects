/*
ID: aksshah1
LANG: JAVA
PROG: gift1
 */

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class gift1 {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
        StringTokenizer st;

        int totalPeople = Integer.parseInt(f.readLine());
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < totalPeople; i++) {
            names.add(f.readLine());
        }
        int[] namesMoney = new int[totalPeople];
        for(String name:names) {
            int gifterIndex = names.indexOf(f.readLine());
            st = new StringTokenizer(f.readLine());
            int amountGifting = Integer.parseInt(st.nextToken());
            int peopleToGift = Integer.parseInt(st.nextToken());
//            System.out.println(names.get(gifterIndex) + " is gifting " + amountGifting + " to " + peopleToGift + " people");
            namesMoney[gifterIndex] -= amountGifting;
            if(peopleToGift != 0) {
                namesMoney[gifterIndex] += amountGifting % peopleToGift;
            } else {
                namesMoney[gifterIndex] += amountGifting;
            }
            for(int i = 0; i < peopleToGift; i++) {
                int giftGoingToIndex = names.indexOf(f.readLine());
                if(peopleToGift != 0) {
                    namesMoney[giftGoingToIndex] += amountGifting / peopleToGift;
                } else {
                    namesMoney[giftGoingToIndex] += 0;
                }
            }
        }
        for(int i = 0; i < names.size(); i++) {
            out.println(names.get(i) + " " + namesMoney[i]);
        }
        out.close();
    }
}