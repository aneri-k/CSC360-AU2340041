# Class Reflection — 29 October 2026

## Topics
- Contrast in digital images
- Histograms and intensity distributions
- Image filters and their applications
- Spatial filtering and convolution kernels
- Noise reduction and edge detection

## Notes

### 1. Understanding contrast in digital images

During this class, we discussed the concept of contrast and its importance in digital image processing. Contrast refers to the difference in luminance or colour that makes objects distinguishable from their surroundings.

We learned about two main types of contrast:

- **High Contrast:** Has a wide range of intensity values, with bright highlights and dark shadows. This makes object boundaries and details more noticeable.
- **Low Contrast:** Has a narrow range of intensity values, making an image appear flat or washed out. Fine details can become difficult to distinguish.

We also discussed how contrast affects visual clarity and computer vision tasks. Higher contrast around object boundaries can help algorithms perform operations such as edge detection and object segmentation more effectively.

### 2. Histograms and intensity distributions

Another topic covered in class was image histograms. A histogram is a graphical representation of the frequency of different pixel intensity values in an image.

For an 8-bit grayscale image, intensity values range from 0 to 255, where 0 represents black and 255 represents white. The horizontal axis represents intensity levels, while the vertical axis represents the number of pixels at each intensity level.

We learned how histograms can help analyse an image:

- **Underexposed Images:** Most pixel values are concentrated near 0, indicating that the image is too dark.
- **Overexposed Images:** Most pixel values are concentrated near 255, indicating that the image is too bright.
- **Low Contrast Images:** Pixel values are concentrated within a narrow intensity range.
- **High Contrast Images:** Pixel values are spread across a wider intensity range.

We also discussed how histograms are useful in image-processing operations such as histogram equalization, which improves contrast by redistributing intensity values, and thresholding, which separates foreground objects from the background based on pixel intensity.

### 3. Image filters and their applications

We learned that an image filter is a mathematical operation used to modify pixel values based on a particular algorithm or kernel. Most spatial filters work by considering a pixel and its neighbouring pixels.

Filters are commonly used for:

- **Noise Reduction:** Removing unwanted variations in pixel values.
- **Smoothing:** Reducing small details and producing a less noisy image.
- **Sharpening:** Making edges and fine details more prominent.
- **Edge Detection:** Identifying boundaries where pixel intensity changes rapidly.

These operations help improve image quality and make important features easier to identify.

### 4. Spatial filtering and convolution

We discussed how spatial filtering works using a small matrix called a kernel or mask, usually of size 3×3 or 5×5.

The kernel moves across the image, and each of its values is multiplied by the corresponding pixel value in the neighbourhood. The resulting products are added together to calculate the new value of the centre pixel.

We also learned about different types of filters and their applications:

- **Gaussian Filter:** Uses weighted averaging to smooth images and reduce Gaussian noise.
- **Median Filter:** Replaces the centre pixel with the median of its neighbouring values. It is particularly useful for removing salt-and-pepper noise while preserving edges.
- **Sobel Filter:** Uses intensity gradients to detect edges and identify horizontal and vertical changes.
- **Laplacian Filter:** Uses second-order derivatives to identify rapid changes in intensity and highlight boundaries.
- **Sharpening Filter:** Enhances fine details and edges by amplifying high-frequency differences.

We understood that different filters are suitable for different tasks. For example, Gaussian filtering is useful for smoothing, while Sobel and Laplacian filters are useful for detecting edges.

## Reflection

This class helped me understand how contrast, histograms, and filters are used to analyse and process digital images. I learned how a histogram can provide information about an image's brightness and contrast, and how filters modify pixel values to reduce noise or highlight important features. I also understood the basic working of convolution and how kernels are applied to neighbouring pixels. These concepts are relevant to our final project on counting birds in a garden, as image quality, noise reduction, and edge detection can affect how accurately birds are identified and counted.

## Key Takeaway

The main takeaway was that image processing involves understanding pixel intensity values and applying suitable transformations to improve an image. Contrast enhancement, histogram analysis, and filtering are important steps that can make objects and their boundaries easier to detect.
