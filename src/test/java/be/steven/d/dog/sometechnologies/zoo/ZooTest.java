package be.steven.d.dog.sometechnologies.zoo;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void test(){
        Keeper manager = Keeper.newBuilder().setKeeperName("Noah").setKeeperRole(Keeper.Role.Manager).build();
        Keeper feeder = Keeper.newBuilder().setKeeperName("Jack").setKeeperRole(Keeper.Role.Feeder).build();

        Habitat habitat = Habitat.newBuilder().setHabitatName("Birds").setNumberOfAnimals(5).addAllKeepers(List.of(feeder)).setFood("seeds").build();

        Zoo zoo = Zoo.newBuilder().addAllHabitats(List.of(habitat)).setManager(manager).build();

        System.out.println(zoo);
    }
}