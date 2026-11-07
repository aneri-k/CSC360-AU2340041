# Class Reflection — 3 November 2026

## Topics
- RGB colour model and pixel composition
- RGBA colour model and alpha transparency
- 32-bit integer pixel representation
- Bitwise packing and unpacking of pixel values
- Memory channel ordering (RGBA, ARGB, BGRA, ABGR)
- Little Endian and Big Endian byte ordering
- Pixel representation and memory handling in Java

## Notes

### 1. RGB colour model and pixel composition

During this class, we discussed how colours are represented digitally using the RGB colour model. RGB stands for Red, Green, and Blue, which are the three primary light components used to create different colours.

Each pixel in an RGB image contains three intensity values corresponding to these channels. In a standard 24-bit image, each channel uses 8 bits and can have values ranging from 0 to 255.

We discussed some common colour combinations:

- `(0, 0, 0)` represents black.
- `(255, 255, 255)` represents white.
- `(255, 0, 0)` represents red.
- `(0, 255, 0)` represents green.
- `(0, 0, 255)` represents blue.
- `(255, 255, 0)` represents yellow.

Since each channel has 256 possible values, an RGB pixel can represent approximately 16.7 million different colours.

### 2. RGBA colour model and alpha transparency

We learned that RGBA extends the RGB model by adding a fourth component called the Alpha channel. While RGB represents colour, the Alpha channel controls the opacity or transparency of a pixel.

The Alpha value also ranges from 0 to 255:

- **0:** Completely transparent.
- **128:** Approximately 50% opacity.
- **255:** Completely opaque.

We discussed how the Alpha channel is useful for layering images, combining foreground and background images, and creating smooth edges through anti-aliasing.

We also looked at alpha blending, where the foreground and background colours are combined based on the opacity value of the foreground pixel. This allows transparent and semi-transparent objects to be displayed correctly.

Another concept covered was the difference between straight alpha and premultiplied alpha. In straight alpha, RGB values are stored independently, whereas in premultiplied alpha, the RGB values are multiplied by the alpha value before compositing.

### 3. 32-bit integer pixel representation

Another important topic was how RGBA pixels can be stored as a single 32-bit integer instead of storing each channel separately.

Since each channel requires 8 bits, four channels together require 32 bits or 4 bytes. A common representation is ARGB, where the bit positions are arranged as follows:

```text
| Alpha (8 bits) | Red (8 bits) | Green (8 bits) | Blue (8 bits) |
```

We learned about bitwise packing, which combines the four channel values into one integer using left shifts (`<<`) and bitwise OR (`|`).

```java
packedPixel = (alpha << 24) |
              (red << 16) |
              (green << 8) |
              blue;
```

We also studied bitwise unpacking, which extracts individual channel values using right shifts and bitwise AND (`&`) with `0xFF`.

This representation makes pixel manipulation convenient and allows the complete pixel to be handled as a single integer.

### 4. Memory channel ordering

We discussed how the four colour channels can be arranged differently in memory depending on the graphics framework, platform, or image format.

The four common channel arrangements are:

- **RGBA:** Red, Green, Blue, Alpha.
- **ARGB:** Alpha, Red, Green, Blue.
- **BGRA:** Blue, Green, Red, Alpha.
- **ABGR:** Alpha, Blue, Green, Red.

We also learned about two types of pixel storage layouts:

- **Planar Format:** All values of one channel are stored together, followed by the other channels.
- **Packed or Interleaved Format:** All channels of one pixel are stored together before moving to the next pixel.

An important point was that using the wrong channel order can produce incorrect colours. For example, interpreting BGRA data as RGBA swaps the red and blue channels, causing the image to appear with unusual colours.

### 5. Little Endian and Big Endian

We learned that endianness determines the order in which the bytes of a multi-byte value are stored in memory.

There are two main types:

**Big Endian:**
- Stores the Most Significant Byte (MSB) at the lowest memory address.
- Follows the same order in which hexadecimal numbers are normally written.
- Commonly associated with network byte order.

**Little Endian:**
- Stores the Least Significant Byte (LSB) at the lowest memory address.
- Used by modern x86 and x86-64 processors and commonly used ARM systems.

We also discussed how endianness affects pixel storage. For example, an ARGB integer represented as `0xAARRGGBB` is stored in memory as `[AA, RR, GG, BB]` on a Big Endian system, but as `[BB, GG, RR, AA]` on a Little Endian system.

This helped explain why the channel order of a pixel in an integer representation may differ from its actual byte sequence in memory.

### 6. Implementation in Java

We also looked at how pixel packing, unpacking, and byte ordering can be implemented in Java.

We discussed the use of bitwise operators to combine and extract individual colour channels. We also looked at Java's `ByteBuffer` and `ByteOrder` classes, which allow programmers to specify whether data should be stored in Big Endian or Little Endian format.

The `BufferedImage` class from `java.awt.image` was also discussed in the context of handling image data.

These operations are useful when working with image buffers, transferring pixel data, and ensuring compatibility between different graphics systems.

## Reflection

This class helped me understand how digital images represent and store colour information at the pixel level. I learned the difference between RGB and RGBA, how transparency is handled using the Alpha channel, and how multiple channel values can be packed into a single 32-bit integer. I also understood that channel ordering and endianness are different concepts, but both affect how pixel data is interpreted in memory. The Java examples helped connect these concepts with practical implementation. These topics are useful for our final project because understanding how image pixels are represented and stored is important when reading, processing, and manipulating images.

## Key Takeaway

The main takeaway was that an image is not simply a visual object but a collection of pixel values stored in memory. Understanding colour channels, pixel packing, channel ordering, and endianness helps us correctly access and manipulate image data during digital image processing.
