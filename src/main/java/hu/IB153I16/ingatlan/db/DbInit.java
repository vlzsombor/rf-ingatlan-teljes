package hu.IB153I16.ingatlan.db;

import hu.IB153I16.ingatlan.Repository.RealEstateRepository;
import hu.IB153I16.ingatlan.Repository.UserRepository;
import hu.IB153I16.ingatlan.model.RealEstate;
import hu.IB153I16.ingatlan.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class DbInit implements CommandLineRunner {

    private UserRepository userRepository;
    @Autowired
    private RealEstateRepository realEstateRepository;


    private PasswordEncoder passwordEncoder;

    public DbInit(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {
        // Delete all
        this.userRepository.deleteAll();

        // Crete users
        //User dan = new User("dan",passwordEncoder.encode("dan123"),"USER","");
        //User admin = new User("admin",passwordEncoder.encode("admin123"),"ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        //User manager = new User("manager",passwordEncoder.encode("manager123"),"MANAGER","ACCESS_TEST1");

        RealEstate re = new RealEstate("Balatoni nyaralo","Balaton utca 54","nagyon jo nyaralo pls buy", 124545);
        RealEstate re1 = new RealEstate("Szentes","szentes utca 54","pls buy", 45);

        //List<User> users = Arrays.asList(dan,admin,manager);
        List<RealEstate> realEstates = Arrays.asList(re,re1);

        // Save to db
        //this.userRepository.saveAll(users);
        this.realEstateRepository.saveAll(realEstates);
    }
}
