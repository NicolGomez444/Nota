/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import memory.Memoy;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jdcob
 */
public class TestMemoria {
    @Test
    public void guardarNull(){
        String abc ="Jose";
        boolean rta = Memoy.guardar(abc);
        System.out.println(rta);
        Assert.assertEquals(rta,true);
    }
    @Test
    public void guardarNull2(){
        boolean rta = Memoy.guardar(null);
        System.out.println(rta);
        Assert.assertEquals(rta,true);
    }
    @Test
    public void guardarOk (){
        boolean rta = Memoy.guardar(this);
        Assert.assertEquals(rta,false);
                }
    @Test
    public void recuperarNotNull (){
        Object rta = (Object)Memoy.recuperar();
        Assert.assertNotNull(rta);
                }

    @Test
    public void recuperarVacio(){
        Object rta = (Object)Memoy.guardar(this);
        Assert.assertEquals(rta,false);
                }
}

    