// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.0
//
// <auto-generated>
//
// Generated from file `MoniCA.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package atnf.atoms.mon.comms;

public final class DataValueBooleanHolder extends Ice.ObjectHolderBase<DataValueBoolean>
{
    public
    DataValueBooleanHolder()
    {
    }

    public
    DataValueBooleanHolder(DataValueBoolean value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof DataValueBoolean)
        {
            value = (DataValueBoolean)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return DataValueBoolean.ice_staticId();
    }
}