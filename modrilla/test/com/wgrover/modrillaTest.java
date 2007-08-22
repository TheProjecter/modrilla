/*
 * modrillaTest.java
 * JUnit based test
 *
 * Created on August 22, 2007, 5:21 PM
 */

package com.wgrover;

import junit.framework.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author wgrover
 */
public class modrillaTest extends TestCase {
    
    public modrillaTest(String testName) {
        super(testName);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class com.wgrover.modrilla.
     */
    public void testMain() {
        System.out.println("main");
        
        String[] args = null;
        
        modrilla.main(args);
        
        
        
        // don't get testy
        
        
        

    }

    /**
     * Test of xyMOD method, of class com.wgrover.modrilla.
     */
    public void testXyMOD() {
        System.out.println("xyMOD");
        
        double xDXFa1 = 1;
        double yDXFa1 = 2;
        double xMODa1 = 3;
        double yMODa1 = 4;
        double xMODa2 = 5;
        double yMODa2 = 6;
        double xDXF = 7;
        double yDXF = 8;
        
        double[] result = modrilla.xyMOD(xDXFa1, yDXFa1, xMODa1, yMODa1, xMODa2, yMODa2, xDXF, yDXF);
                
        assertEquals(result[0], 3.0000000000000004);
        assertEquals(result[1], 12.48528137423857);
        
    }
    
}
