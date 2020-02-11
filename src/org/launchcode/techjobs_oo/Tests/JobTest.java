package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;
    Job job2Duplicate;
    Job job3;
    Job job4;
    Job job5;

    @Before
    public void createJobObjects() {
        job1 = new Job("Software Developer", new Employer("ShotTracker"), new Location("Kansas City"), new PositionType("Marketing"), new CoreCompetency("React"));
        job2 = new Job("Custom Solutions Developer", new Employer("VMLY&R"), new Location("Chicago, IL"), new PositionType("Client Services"), new CoreCompetency("JavaScript"));
        job2Duplicate = new Job("Custom Solutions Developer", new Employer("VMLY&R"), new Location("Chicago, IL"), new PositionType("Client Services"), new CoreCompetency("JavaScript"));
        job4 = new Job("", new Employer("Crema"), new Location(), new PositionType(), new CoreCompetency());
        job5 = new Job("", new Employer(), new Location(), new PositionType(), new CoreCompetency());

    }

    @Test
    public void jobIdTest() {
        assertTrue(job1.getId() != job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() == "Product tester");

        assertTrue(job3.getEmployer().getValue() == "ACME");
        assertTrue(job3.getEmployer() instanceof Employer);

        assertTrue(job3.getLocation().getValue() == "Desert");
        assertTrue(job3.getLocation() instanceof Location);

        assertTrue(job3.getPositionType().getValue() == "Quality control");
        assertTrue(job3.getPositionType() instanceof PositionType);

        assertTrue(job3.getCoreCompetency().getValue() == "Persistence");
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job2Duplicate.equals(job2));
    }

    @Test
    public void testJobFormat1() {
        assertTrue(job1.toString().startsWith("\n"));
        assertTrue(job1.toString().endsWith("\n"));
    }

    @Test
    public void testJobFormat2() {
        assertTrue(job1.toString().contains("ID: " + job1.getId()));
        assertTrue(job1.toString().contains("Name: " + job1.getName()));
        assertTrue(job1.toString().contains("Employer: " + job1.getEmployer()));
        assertTrue(job1.toString().contains("Location: " + job1.getLocation()));
        assertTrue(job1.toString().contains("Position Type: " + job1.getPositionType()));
        assertTrue(job1.toString().contains("Core Competency: " + job1.getCoreCompetency()));
    }

    @Test
    public void testJobFormat3() {
        assertTrue(job4.toString().contains("Name: Data not available"));
        assertTrue(job4.toString().contains("Location: Data not available"));
        assertTrue(job4.toString().contains("Position Type: Data not available"));
        assertTrue(job4.toString().contains("Core Competency: Data not available"));
    }

    @Test
    public void testJobFormat4() {
        assertTrue(job5.toString().contains("OOPS! This job does not seem to exist"));
    }

}