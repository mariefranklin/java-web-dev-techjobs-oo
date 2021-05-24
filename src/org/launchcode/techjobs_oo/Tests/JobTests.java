package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

public class JobTests {
    Job jobObjectOne;
    Job jobObjectTwo;
    Job jobObjectThree;
    Job jobObjectFour;
    Job jobObjectFive;
    Job jobObjectSix;


    @Before
    public void prepTest() {
        jobObjectOne = new Job();
        jobObjectTwo = new Job();
        jobObjectThree = new Job();
        jobObjectFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobObjectFive = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobObjectSix = new Job(null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }
        @Test
    @DisplayName("ID values for the two objects differ by 1")
    public void testSettingJobId(){
        assertFalse(jobObjectOne.getId() == jobObjectTwo.getId());
}
    @Test
    public void testJobConstructorSetsAllFields(){
        jobObjectThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(jobObjectThree instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(jobObjectFour.getId() == jobObjectFive.getId());
    }

    @Test
    public void testToString(){
        System.out.println(jobObjectSix.toString());

        }
    }

