>>>>>>>>>>>>> RECTANGLE

package shapes;

/**
 * A kind of shape that represents a rectangle.
 * 
 * @author mdixon
 */
public class Rectangle extends Shape {

    /**
     * The width of the rectangle
     */
    private int width;

    /**
     * The height of the rectangle
     */
    private int height;

    ///////////////////////////////////////////////////////////////////////

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (height + width);
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return true if the rectangle is actually rectangular (sides not equal length), else false.
     */
    public boolean isRectangular() {
        return width != height;
    }

    /**
     * @return true if the rectangle is actually square, else false.
     */
    public boolean isSquare() {
        return width == height;
    }

    ///////////////////////////////////////////////////////////////////////

    /**
     * Constructor
     * <p>
     * Creates a rectangle with a width of 1 and height of 1.
     *
     * @param colour the colour of the rectangle
     */
    public Rectangle(String colour) {
        super(4, "Rectangle", colour);
        this.width = 1;
        this.height = 1;
    }
}

>>>>>>>>>>>>>Circle

package shapes;

/**
 * A kind of shape that represents a circle.
 * 
 * For calculations, this uses the constant {@link Math#PI} as an approximation of the value for π
 * 
 * @author mdixon
 */
public class Circle extends Shape {

	/**
	 * The radius of the circle.
	 */
	private int radius;

	///////////////////////////////////////////////////////////////////////

	@Override
	public double getArea() {
		// Calculate and return the area using Area = π x r²
		// hint: Use Math.PI in the calculation
		return Math.PI * radius * radius;
	}
	
	@Override
	public double getPerimeter() {
		// Calculate and return the perimeter using Perimeter = 2 x π x r
		return 2 * Math.PI * radius;
	}
		
	/**
	 * Gets the volume of the circle as if it was a spherical shape with the same radius.
	 * 
	 * @return the volume of a sphere with the same radius as the circle.
	 */
	public double getVolume() {
		// Calculate and return the volume using Volume = 4/3 x π x r³
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	}
	
	/**
	 * @return the radius
	 */
	public int getRadius() {
		// Return the radius
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		// Set the radius
		this.radius = radius;
	}
	
	/**
	 * Tests if the circle has a radius larger than the one provided.
	 * 
	 * @param radius the radius to compare against the circle's radius
	 * @return true if the circle has a radius that is greater than the given radius, else false.
	 */
	public boolean isLargerThan(int radius) {
		// Return true if the circle's radius is larger than the one given
		return this.radius > radius;
	}
	
	/**
	 * Tests if the circle has a radius smaller than the one provided.
	 * 
	 * @param radius the radius to compare against the circle's radius
	 * @return true if the circle has a radius that is less than the given radius, else false.
	 */
	public boolean isSmallerThan(int radius) {
		// Return true if the circle's radius is smaller than the one given
		return this.radius < radius;
	}
	
	///////////////////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param colour the colour of the circle
	 * @param radius the radius of the circle
	 */
	public Circle(String colour, int radius) {
		// Pass the correct number of sides, shape name, and colour to the super() type constructor.
		super(0, "Circle", colour);
		// Set the radius attribute to the given value
		this.radius = radius;
	}

	/**
	 * Constructor
	 * 
	 * Creates a circle with a default radius of 10.
	 *  
	 * @param colour the colour of the circle
	 */
	public Circle(String colour) {
		// Pass the correct number of sides, shape name, and colour to the super() type constructor.
		super(0, "Circle", colour);
		// Set the radius attribute to the default value specified in the javadoc comment of the method.
		this.radius = 10;
	}
	
	/**
	 * Default Constructor
	 * 
	 * Creates a "RED" circle with a default radius of 1.  
	 */
	public Circle() {
		// Pass the correct number of sides, shape name, and default colour to the super() type constructor.
		super(0, "Circle", "RED");
		// Set the radius attribute to the default value specified in the javadoc comment of the method.
		this.radius = 1;
	}
}

>>>>>>>>>>>>>>RightTriangle

package shapes;

/**
 * A kind of shape that represents a right angle triangle (orthogonal triangle) in which two sides are perpendicular, and one angle is always 90 degrees.
 * 
 * The length of the third side (Hypotenuse) is not stored, since this can be calculated using Pythagoras' theorem. i.e. sideC² = (sideA² + sideB²)
 * 
 * @author mdixon
 */
public class RightTriangle extends Shape {

	/**
	 * Length of side A, always positive.
	 */
	private int sideA;

	/**
	 * Length of side B, always positive.
	 */
	private int sideB;

	///////////////////////////////////////////////////////////////////////

	@Override
	public double getArea() {
		// Return the area (which is half the area of a rectangle with the same dimensions)
		return 0.5 * sideA * sideB;
	}

	@Override
	public double getPerimeter() {
		// Return sideA + sideB + sideC
		return sideA + sideB + getSideC();
	}
	
	/**
	 * Gets the length of side A
	 * 
	 * @return the length of side A
	 */
	public int getSideA() {
		// Return sideA
		return sideA;
	}
	
	/**
	 * Gets the length of side B
	 * 
	 * @return the length of side B
	 */
	public int getSideB() {
		// Return sideB
		return sideB;
	}
	
	/**
	 * Gets the length of the Hypotenuse (as an integer) using √(sideA² + sideB²).
	 * 
	 * @return the length of side C (the Hypotenuse) as an integer
	 */
	public int getSideC() {
		// Calculate and return the length of sideC as an integer
		return (int) Math.sqrt(sideA * sideA + sideB * sideB);
	}

	/**
	 * Tests if the triangle is isosceles (has two equal length sides)
	 * 
	 * @return true if the triangle is isosceles, else false.
	 */
	public boolean isIsosceles() {
		// Return true if two sides are of equal length
		return sideA == sideB || sideA == getSideC() || sideB == getSideC();
	}

	/**
	 * Scales the size of the triangle by multiplying each side by the given value.
	 * 
	 * @param multiplier the value to be used to scale the sides of the triangle.
	 */
	public void expand(int multiplier) {
		// Multiply the side attributes by the given multiplier
		sideA *= multiplier;
		sideB *= multiplier;
	}

	/**
	 * Scales the size of the triangle by dividing each side by the given value.
	 * 
	 * @param divisor the value to be used to scale the sides of the triangle.
	 */
	public void contract(int divisor) {
		// Divide the side attributes by the given divisor
		if (divisor != 0) {
			sideA /= divisor;
			sideB /= divisor;
		}
	}

	///////////////////////////////////////////////////////////////////////

	/**
	 * Constructor that creates a right angle triangle with sides equal to 3, 4 and 5.
	 * 
	 * @param colour
	 */
	public RightTriangle(String colour) {
		// Pass the correct number of sides, and shape name to the super() type constructor.
		super(3, "Right Triangle", colour);
		// Set the side attributes to the default value specified in the javadoc comment of the method.
		sideA = 3;
		sideB = 4;
	}

	/**
	 * Constructor that creates a right angle triangle with each side set to a given value.
	 * 
	 * note: Any negative values are converted to be absolute positive values.
	 *
	 * @param colour the colour of the triangle.
	 * @param a      length of side A
	 * @param b      length of side B
	 */
	public RightTriangle(String colour, int a, int b) {
		// Pass the correct number of sides, shape name, and colour parameter to the super() type constructor.
		super(3, "Right Triangle", colour);
		// Set the side attributes to the values given (ensuring they are not negative)
		sideA = Math.abs(a);
		sideB = Math.abs(b);
	}
}


>>>>>>>>ShapeList



package shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the {@link ShapeCollection} interface using an underlying ordered list.
 * 
 * @author mdixon
 */
public class ShapeList implements ShapeCollection {

	/**
	 * The list of shapes
	 */
	private List<Shape> shapes = new ArrayList<>();

	///////////////////////////////////////////////////////////////////////

	@Override
	public int addShape(Shape shape) {
		// Add the shape to the list, then return the size of the list once added.
		shapes.add(shape);
		return shapes.size();
	}

	@Override
	public boolean removeShape(Shape shape) {
		// Remove the shape from the list, returning true if actually removed, else returning false.
		return shapes.remove(shape);
	}

	@Override
	public boolean containsShape(Shape shape) {
		// Return true if the list contains the given shape, else return false.
		return shapes.contains(shape);
	}

	@Override
	public int shapeCount() {
		// Return the size of the list
		return shapes.size();
	}

	@Override
	public void clearAllShapes() {
		// Remove all elements from the list
		shapes.clear();
	}

	@Override
	public int indexOfShape(Shape shape) {
		// Locate the given shape in the list, returning its index position.
		return shapes.indexOf(shape);
	}

	@Override
	public Shape getLargestShape() {
		double maxArea = 0;
		Shape largest = null;

		// Iterate the list, finding the shape with the largest area
		for (Shape shape : shapes) {
			double area = shape.getArea();
			if (area > maxArea) {
				maxArea = area;
				largest = shape;
			}
		}

		return largest;
	}

	@Override
	public Shape getSmallestShape() {
		double minArea = Double.MAX_VALUE;
		Shape smallest = null;

		// Iterate the list, finding the shape with the smallest area
		for (Shape shape : shapes) {
			double area = shape.getArea();
			if (area < minArea) {
				minArea = area;
				smallest = shape;
			}
		}

		return smallest;
	}

	@Override
	public int countShapeOfColour(String colour) {
		// Check if the given colour is null
		if (colour == null) {
			throw new IllegalArgumentException("Colour cannot be null");
		}

		int count = 0;

		// Iterate the list, counting the number of shapes with the given colour
		// Hint: Call getColour() for each shape and compare with the given colour using a method

		return count;
	}

	///////////////////////////////////////////////////////////////////////

}


>>>>>>>>>>ShapeMap

package shapes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Implements the {@link ShapeCollection} interface using an underlying map allowing the number of occurrences of each added shape to be counted.
 * 
 * If the same shape is added more than once, then it is not re-added, but its occurrence count is increased.
 * 
 * @author mdixon
 */
public class ShapeMap implements ShapeCollection {

	/**
	 * A collection which maps contained shapes to an occurrence count.
	 */
	private Map<Shape, Integer> shapes = new HashMap<>(); // Create a suitable map instance

	///////////////////////////////////////////////////////////////////////

	@Override
	public int addShape(Shape shape) {

		// Add the shape to the map, setting the correct associated occurrence count
		// If the shape was not already in the map, set the associated count to 1
		// Otherwise, increase the existing occurrence count.
		// Finally, return the total number of key/value pairs in the map

		shapes.put(shape, shapes.getOrDefault(shape, 0) + 1);
		return shapes.size();
	}

	@Override
	public boolean removeShape(Shape shape) {

		// Remove the shape if it exists and return true. Return false if it does not exist.
		if (shapes.containsKey(shape)) {
			int occurrenceCount = shapes.get(shape);
			if (occurrenceCount == 1) {
				shapes.remove(shape);
			} else {
				shapes.put(shape, occurrenceCount - 1);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean containsShape(Shape shape) {

		// Check if the map contains the given shape as a key
		return shapes.containsKey(shape);
	}

	@Override
	public int shapeCount() {

		// Return the number of key/value pairs in the map
		return shapes.size();
	}

	@Override
	public void clearAllShapes() {

		// Remove all shapes from the map
		shapes.clear();
	}

	@Override
	public int indexOfShape(Shape shape) {

		// Throw the correct exception which indicates this is an unsupported operation
		throw new UnsupportedOperationException("indexOfShape is not supported in ShapeMap");
	}

	@Override
	public Shape getLargestShape() {
		
		Shape largest = null;
		double maxArea = 0;

		// Iterate the map and find the shape with the largest area
		for (Entry<Shape, Integer> entry : shapes.entrySet()) {
			Shape currentShape = entry.getKey();
			double area = currentShape.getArea();
			if (area > maxArea) {
				maxArea = area;
				largest = currentShape;
			}
		}

		return largest;
	}

	@Override
	public Shape getSmallestShape() {
		
		Shape smallest = null;
		double minArea = Double.MAX_VALUE;

		// Iterate the map and find the shape with the smallest area
		for (Entry<Shape, Integer> entry : shapes.entrySet()) {
			Shape currentShape = entry.getKey();
			double area = currentShape.getArea();
			if (area < minArea) {
				minArea = area;
				smallest = currentShape;
			}
		}

		return smallest;
	}

	@Override
	public int countShapeOfColour(String colour) {

		int count = 0;

		// Iterate the map and count the shapes which are the given colour.
		for (Entry<Shape, Integer> entry : shapes.entrySet()) {
			Shape currentShape = entry.getKey();
			if (colour.equals(currentShape.getColour())) {
				count += entry.getValue();
			}
		}

		return count;
	}
	
	/**
	 * Gets the shape which has the highest occurrence count (i.e. has been added to the collection the most number of times).
	 * 
	 * @return the shape which has been added to the collection the most number of times, null if no shapes exist within the collection.
	 */
	public Shape getMostCommonShape() {
		
		Shape mostCommonShape = null;
		int maxOccurrences = 10;

		// Iterate the map and find the shape with the highest occurrence count
		for (Entry<Shape, Integer> entry : shapes.entrySet()) {
			int occurrences = entry.getValue();
			if (occurrences > maxOccurrences) {
				maxOccurrences = occurrences;
				mostCommonShape = entry.getKey();
			}
		}
		
		return mostCommonShape;
	}
	
	/**
	 * Gets the occurrence count of the most common shape.
	 * 
	 * @return the occurrence count of the most common shape, 0 if no shapes exist within the collection.
	 */
	public int getMostCommonShapeCount() {

		Shape mostCommonShape = getMostCommonShape();

		// If the shape is not null, then get the associated occurrence count from the map
		if (mostCommonShape != null) {
			return shapes.get(mostCommonShape);
		}

		return 0;
	}
	
	///////////////////////////////////////////////////////////////////////

}

