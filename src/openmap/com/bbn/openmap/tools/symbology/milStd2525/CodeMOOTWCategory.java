// **********************************************************************
// 
// <copyright>
// 
//  BBN Technologies, a Verizon Company
//  10 Moulton Street
//  Cambridge, MA 02138
//  (617) 873-8000
// 
//  Copyright (C) BBNT Solutions LLC. All rights reserved.
// 
// </copyright>
// **********************************************************************
// 
// $Source: /cvs/distapps/openmap/src/openmap/com/bbn/openmap/tools/symbology/milStd2525/CodeMOOTWCategory.java,v $
// $RCSfile: CodeMOOTWCategory.java,v $
// $Revision: 1.1 $
// $Date: 2003/12/08 18:37:51 $
// $Author: dietrick $
// 
// **********************************************************************


package com.bbn.openmap.tools.symbology.milStd2525;

import java.util.ArrayList;
import java.util.List;

public class CodeMOOTWCategory extends CodePosition {

    protected final static int position = 3;
    protected final static int length = 1;
    protected final static Class nextPosition = CodeFunctionID.class;

    public final static CodeMOOTWCategory VIOLENT_ACTIVITIES = 
	new CodeMOOTWCategory(1, 'V', "VIOLENT ACTIVITIES");
    public final static CodeMOOTWCategory LOCATIONS = 
	new CodeMOOTWCategory(2, 'L', "LOCATIONS");
    public final static CodeMOOTWCategory OPERATIONS = 
	new CodeMOOTWCategory(3, 'O', "OPERATIONS");
    public final static CodeMOOTWCategory ITEMS = 
	new CodeMOOTWCategory(4, 'I', "ITEMS");

    protected CodeMOOTWCategory(int heirarchyLevelNumber, char idChar, String name) {
	super(heirarchyLevelNumber, idChar, name);
    }

    public static List getList() {
	List list = (List)positions.get(CodeMOOTWCategory.class);
	if (list == null) {
	    list = new ArrayList();
	    list.add(VIOLENT_ACTIVITIES);
	    list.add(LOCATIONS);
	    list.add(OPERATIONS);
	    list.add(ITEMS);
	    positions.put(CodeMOOTWCategory.class, list);
	}
	return list;
    }

    public int getPosition() {
	return position;
    }

    public int getLength() {
	return length;
    }

    public Class getNextPosition() {
	return nextPosition;
    }

}