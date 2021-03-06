/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chess.pieces;

import com.mycompany.chess.board.Board;
import com.mycompany.chess.board.Coords;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fuji
 */
public class KnightTest {
    
    public KnightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Knight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Knight instance = new Knight(0,0, false);
        String expResult = "Knight";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPossibleMoves method, of class Knight.
     */
    @Test
    public void testGetPossibleMoves() {
        System.out.println("getPossibleMoves");
        Knight instance = new Knight(0,0, false);
        assertEquals(1, instance.getPossibleMoves(new Board()).size());
        instance.setX(0);
        instance.setY(2);
        assertEquals(2, instance.getPossibleMoves(new Board()).size());
        instance.setX(3);
        instance.setY(5);
        assertEquals(8, instance.getPossibleMoves(new Board()).size());
        instance.setX(6);
        instance.setY(6);
        assertEquals(4, instance.getPossibleMoves(new Board()).size());
    }
    
}
