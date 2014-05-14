/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minecraft.Data.Content;

import com.minecraft.Data.Config;

/**
 *
 * @author Pascal
 */
public interface Content {

    public void preInit(ContentManager manager, Config cfg);
    
    public void init(ContentManager manager);
    
    public void postInit(ContentManager manager);
    
    public String getName();

}
