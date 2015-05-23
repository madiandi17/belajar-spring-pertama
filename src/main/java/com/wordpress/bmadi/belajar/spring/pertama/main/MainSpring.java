package com.wordpress.bmadi.belajar.spring.pertama.main;

import com.wordpress.bmadi.belajar.spring.pertama.domain.Address;
import com.wordpress.bmadi.belajar.spring.pertama.domain.Person;
import java.util.Date;

public class MainSpring {

    public static void main(String[] args) {
        Person andi = new Person();
        andi.setFirstName("Madi");
        andi.setLastName("Andi");
        andi.setTanggalLahir(new Date());

        Address rumah = new Address();
        rumah.setJalan("Jl. Madi Andi");
        rumah.setKota("Palembang");
        rumah.setKodePos("171218");
        
        // set address andi
        andi.setAddress(rumah);

        // menampilkan identitas andi
        System.out.println("-- Identitas Person -- ");
        System.out.println("firstName : " + andi.getFirstName());
        System.out.println("lastName : " + andi.getLastName());
        System.out.println("tanggalLahir : " + andi.getTanggalLahir());
        System.out.println("");
        
        // menampilkan address andi
        System.out.println("-- Address Person -- ");
        System.out.println("jalan : " + andi.getAddress().getJalan());
        System.out.println("kota : " + andi.getAddress().getKota());
        System.out.println("kodePos : " + andi.getAddress().getKodePos());
    }

}
