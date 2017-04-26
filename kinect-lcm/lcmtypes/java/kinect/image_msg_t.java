/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package kinect;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class image_msg_t implements lcm.lcm.LCMEncodable
{
    public long timestamp;
    public short width;
    public short height;
    public int image_data_nbytes;
    public byte image_data[];
    public byte image_data_format;
 
    public image_msg_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x01fc0e88fea09363L;
 
    public static final byte VIDEO_RGB = (byte) 0;
    public static final byte VIDEO_BAYER = (byte) 1;
    public static final byte VIDEO_IR_8BIT = (byte) 2;
    public static final byte VIDEO_IR_10BIT = (byte) 3;
    public static final byte VIDEO_IR_10BIT_PACKED = (byte) 4;
    public static final byte VIDEO_YUV_RGB = (byte) 5;
    public static final byte VIDEO_YUV_RAW = (byte) 6;
    public static final byte VIDEO_RGB_JPEG = (byte) 100;
    public static final byte VIDEO_NONE = (byte) 101;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(kinect.image_msg_t.class))
            return 0L;
 
        classes.add(kinect.image_msg_t.class);
        long hash = LCM_FINGERPRINT_BASE
            ;
        classes.remove(classes.size() - 1);
        return (hash<<1) + ((hash>>63)&1);
    }
 
    public void encode(DataOutput outs) throws IOException
    {
        outs.writeLong(LCM_FINGERPRINT);
        _encodeRecursive(outs);
    }
 
    public void _encodeRecursive(DataOutput outs) throws IOException
    {
        outs.writeLong(this.timestamp); 
 
        outs.writeShort(this.width); 
 
        outs.writeShort(this.height); 
 
        outs.writeInt(this.image_data_nbytes); 
 
        if (this.image_data_nbytes > 0)
            outs.write(this.image_data, 0, image_data_nbytes);
 
        outs.writeByte(this.image_data_format); 
 
    }
 
    public image_msg_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public image_msg_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static kinect.image_msg_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        kinect.image_msg_t o = new kinect.image_msg_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.timestamp = ins.readLong();
 
        this.width = ins.readShort();
 
        this.height = ins.readShort();
 
        this.image_data_nbytes = ins.readInt();
 
        this.image_data = new byte[(int) image_data_nbytes];
        ins.readFully(this.image_data, 0, image_data_nbytes); 
        this.image_data_format = ins.readByte();
 
    }
 
    public kinect.image_msg_t copy()
    {
        kinect.image_msg_t outobj = new kinect.image_msg_t();
        outobj.timestamp = this.timestamp;
 
        outobj.width = this.width;
 
        outobj.height = this.height;
 
        outobj.image_data_nbytes = this.image_data_nbytes;
 
        outobj.image_data = new byte[(int) image_data_nbytes];
        if (this.image_data_nbytes > 0)
            System.arraycopy(this.image_data, 0, outobj.image_data, 0, this.image_data_nbytes); 
        outobj.image_data_format = this.image_data_format;
 
        return outobj;
    }
 
}
