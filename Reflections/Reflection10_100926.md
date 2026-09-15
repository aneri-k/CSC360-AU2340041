# Class Reflection — 10 September 2026

## Topics

* Streaming and downloading
* Streaming in graphics
* Server-side and client-side rendering
* Storing images
* AWT and Swing
* Platform abstraction in AWT

## Notes

I was not present in class on 10 September, so I asked my teammates and read some classmates' reflections on what topics were covered. 

### Streaming and Downloading

The first topic was the difference between streaming and downloading. Both involve transferring data from somewhere else, but the main difference is how the data is used.

In streaming, we can start using the data before the complete data has arrived. For example, when watching an online video, some part of the video is first stored in a buffer and playback starts while the remaining parts continue to arrive.

In downloading, the file is transferred and stored locally so that it can be used later without needing the network.

We also discussed **buffering** and **adaptive bitrate streaming**. Buffering helps handle small network interruptions, while adaptive bitrate allows the quality of the content to change depending on the available network speed.

---

### Streaming in Graphics

Streaming can also be used in graphics applications. For example, large games do not need to load every texture, model, and other asset into memory at the beginning. They can load the assets that are currently needed and remove assets that are no longer required.

This helps reduce memory usage and initial loading time.

**Cloud gaming** is another example. The game runs on a remote server, which renders the frames and sends the video and audio to the user's device. The user's inputs are sent back to the server. This reduces the hardware requirements on the user's device, but it also means that latency and network quality become very important.

Similar ideas are used in remote desktops, CAD, scientific visualization, and VR/AR applications.

---

### Server-Side and Client-Side Rendering

We also discussed **Server-Side Rendering (SSR)** and **Client-Side Rendering (CSR)**.

In SSR, the server prepares the HTML and sends the rendered content to the browser. This can help with showing content earlier and can also be useful for search engine indexing.

In CSR, the browser receives the basic page and JavaScript, and the JavaScript runs in the browser to create and update the user interface.

A simple way to remember the difference is:

**SSR → Server does more of the initial rendering.**

**CSR → Browser does more of the rendering.**

Both approaches have advantages and disadvantages. SSR can provide content earlier but puts more work on the server, while CSR can be useful for highly interactive applications but may require more JavaScript to be loaded initially.

Modern applications can also combine both approaches instead of using only one.

---

### Storing Images

Another topic was how images should be stored in applications. A common approach is to store the actual image file in **object storage** and keep the image's information in a database.

For example:

**Image → Object storage**

**Image metadata → Database**

The database can store information such as the filename, image type, size, dimensions, owner, upload time, and permissions.

Services such as Amazon S3 are commonly used for storing large files because they are designed to handle a large number of objects. For private images, signed URLs can also be used to provide temporary access.

Images can also technically be stored directly in a database using binary or BLOB fields, but object storage is generally more practical for large-scale media applications.

---

### Why is AWT called Abstract Window Toolkit?

We also discussed why **AWT** is called the **Abstract Window Toolkit**.

The word "abstract" refers to the fact that Java provides a common API while hiding many of the platform-specific details of the operating system.

For example, Java provides classes such as `Frame`, `Button`, `TextField`, and `Graphics`. These can then connect to the appropriate platform-specific windowing system.

The basic idea is:

**Java application → AWT API → Platform-specific toolkit → Operating system**

This allows similar Java code to work across different operating systems without the programmer having to write completely different GUI code for each platform.

---

### AWT and Swing

Finally, we discussed the relationship between **AWT and Swing**.

AWT provides basic windowing, graphics, event handling, and layout functionality. Many AWT components are **heavyweight**, meaning they are connected to native operating-system components.

Swing is built on top of AWT and provides components such as `JFrame` and `JButton`. Most Swing components are lightweight and are painted by Java. Swing also provides support for different look-and-feel options.

So, Swing did not completely replace AWT. It still uses many AWT features such as events, layouts, fonts, colours, and graphics.

## Reflection

Even though I was not present for this class, going through the material helped me understand how different concepts that we normally see separately are connected. The difference between streaming and downloading was particularly easy to relate to because both are used regularly.

I also found the discussion about streaming in graphics and cloud gaming interesting because it showed how graphics can be handled remotely instead of everything being processed on the local computer. Similarly, understanding SSR and CSR helped me see how websites decide where the work of rendering should happen.

The explanation of AWT and Swing also connected well with the GUI topics we have discussed earlier. Overall, the material helped me understand how Java handles graphics and user interfaces while also showing how similar concepts such as streaming, rendering, and storage are used in larger software systems.
