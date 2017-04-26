/* LCM type definition class file
 * This file was automatically generated by lcm-gen
 * DO NOT MODIFY BY HAND!!!!
 */

package kinect;
 
import java.io.*;
import java.util.*;
import lcm.lcm.*;
 
public final class depth_msg_t implements lcm.lcm.LCMEncodable
{
    public long timestamp;
    public short width;
    public short height;
    public int depth_data_nbytes;
    public byte depth_data[];
    public byte depth_data_format;
    public byte compression;
    public int uncompressed_size;
 
    public depth_msg_t()
    {
    }
 
    public static final long LCM_FINGERPRINT;
    public static final long LCM_FINGERPRINT_BASE = 0x2006d888ce0bb5f6L;
 
    public static final byte COMPRESSION_NONE = (byte) 0;
    public static final byte COMPRESSION_ZLIB = (byte) 1;
    public static final byte DEPTH_11BIT = (byte) 0;
    public static final byte DEPTH_10BIT = (byte) 1;
    public static final byte DEPTH_11BIT_PACKED = (byte) 2;
    public static final byte DEPTH_10BIT_PACKED = (byte) 3;
    public static final byte DEPTH_REGISTERED = (byte) 4;
    public static final byte DEPTH_MM = (byte) 5;
    public static final byte DEPTH_NONE = (byte) 10;

    static {
        LCM_FINGERPRINT = _hashRecursive(new ArrayList<Class<?>>());
    }
 
    public static long _hashRecursive(ArrayList<Class<?>> classes)
    {
        if (classes.contains(kinect.depth_msg_t.class))
            return 0L;
 
        classes.add(kinect.depth_msg_t.class);
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
 
        outs.writeInt(this.depth_data_nbytes); 
 
        if (this.depth_data_nbytes > 0)
            outs.write(this.depth_data, 0, depth_data_nbytes);
 
        outs.writeByte(this.depth_data_format); 
 
        outs.writeByte(this.compression); 
 
        outs.writeInt(this.uncompressed_size); 
 
    }
 
    public depth_msg_t(byte[] data) throws IOException
    {
        this(new LCMDataInputStream(data));
    }
 
    public depth_msg_t(DataInput ins) throws IOException
    {
        if (ins.readLong() != LCM_FINGERPRINT)
            throw new IOException("LCM Decode error: bad fingerprint");
 
        _decodeRecursive(ins);
    }
 
    public static kinect.depth_msg_t _decodeRecursiveFactory(DataInput ins) throws IOException
    {
        kinect.depth_msg_t o = new kinect.depth_msg_t();
        o._decodeRecursive(ins);
        return o;
    }
 
    public void _decodeRecursive(DataInput ins) throws IOException
    {
        this.timestamp = ins.readLong();
 
        this.width = ins.readShort();
 
        this.height = ins.readShort();
 
        this.depth_data_nbytes = ins.readInt();
 
        this.depth_data = new byte[(int) depth_data_nbytes];
        ins.readFully(this.depth_data, 0, depth_data_nbytes); 
        this.depth_data_format = ins.readByte();
 
        this.compression = ins.readByte();
 
        this.uncompressed_size = ins.readInt();
 
    }
 
    public kinect.depth_msg_t copy()
    {
        kinect.depth_msg_t outobj = new kinect.depth_msg_t();
        outobj.timestamp = this.timestamp;
 
        outobj.width = this.width;
 
        outobj.height = this.height;
 
        outobj.depth_data_nbytes = this.depth_data_nbytes;
 
        outobj.depth_data = new byte[(int) depth_data_nbytes];
        if (this.depth_data_nbytes > 0)
            System.arraycopy(this.depth_data, 0, outobj.depth_data, 0, this.depth_data_nbytes); 
        outobj.depth_data_format = this.depth_data_format;
 
        outobj.compression = this.compression;
 
        outobj.uncompressed_size = this.uncompressed_size;
 
        return outobj;
    }
 
}
