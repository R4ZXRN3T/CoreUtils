package org.R4ZXRN3T.Vectors;

/**
 * Represents a generic 2-dimensional vector with numeric components.
 * Supports basic vector arithmetic and utility operations.
 *
 * @param <T> the type of the numeric components, must extend {@link Number}. To be fully compatible with the implementation, it must be of type {@link Integer}, {@link Long}, {@link Float}, {@link Double}, {@link Short} or {@link Byte}.
 */
public class Vec2<T extends Number> {
	private T value1;
	private T value2;

	/**
	 * Constructs a new vector with the specified components.
	 *
	 * @param value1 the first component
	 * @param value2 the second component
	 */
	public Vec2(T value1, T value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	/**
	 * Returns the first component of the vector.
	 *
	 * @return the first component
	 */
	public T getValue1() {
		return value1;
	}

	/**
	 * Sets the first component of the vector.
	 *
	 * @param value the new value for the first component
	 */
	public void setValue1(T value) {
		this.value1 = value;
	}

	/**
	 * Returns the second component of the vector.
	 *
	 * @return the second component
	 */
	public T getValue2() {
		return value2;
	}

	/**
	 * Sets the second component of the vector.
	 *
	 * @param value the new value for the second component
	 */
	public void setValue2(T value) {
		this.value2 = value;
	}

	/**
	 * Returns a string representation of the vector in the form (value1, value2).
	 *
	 * @return a string representation of the vector
	 */
	@Override
	public String toString() {
		return "(" + this.value1.toString() + ", " + this.value2.toString() + ")";
	}

	/**
	 * Checks if this vector is equal to another object.
	 * Two vectors are equal if their components are equal.
	 *
	 * @param obj the object to compare with
	 * @return true if the vectors are equal, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Vec2<?> vec2 = (Vec2<?>) obj;
		return value1.equals(vec2.value1) && value2.equals(vec2.value2);
	}

	/**
	 * Returns the hash code for this vector.
	 *
	 * @return the hash code
	 */
	@Override
	public int hashCode() {
		return java.util.Objects.hash(value1, value2);
	}

	/* ======= Calculation methods ======= */

	/**
	 * Calculates the Euclidean length (magnitude) of the vector.
	 *
	 * @return the length of the vector
	 */
	public double getLength() {
		return Math.sqrt(Math.pow(value1.doubleValue(), 2) + Math.pow(value2.doubleValue(), 2));
	}

	/**
	 * Adds another vector to this vector and returns the result.
	 *
	 * @param summand the vector to add
	 * @return the resulting vector after addition
	 * @throws UnsupportedOperationException if the type is not supported
	 */
	@SuppressWarnings("unchecked")
	public Vec2<T> add(Vec2<T> summand) {
		if (value1 instanceof Integer) {
			return new Vec2<>(
					(T) Integer.valueOf(value1.intValue() + summand.getValue1().intValue()),
					(T) Integer.valueOf(value2.intValue() + summand.getValue2().intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec2<>(
					(T) Long.valueOf(value1.longValue() + summand.getValue1().longValue()),
					(T) Long.valueOf(value2.longValue() + summand.getValue2().longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec2<>(
					(T) Float.valueOf(value1.floatValue() + summand.getValue1().floatValue()),
					(T) Float.valueOf(value2.floatValue() + summand.getValue2().floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec2<>(
					(T) Double.valueOf(value1.doubleValue() + summand.getValue1().doubleValue()),
					(T) Double.valueOf(value2.doubleValue() + summand.getValue2().doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec2<>(
					(T) Byte.valueOf((byte) (value1.byteValue() + summand.getValue1().byteValue())),
					(T) Byte.valueOf((byte) (value2.byteValue() + summand.getValue2().byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec2<>(
					(T) Short.valueOf((short) (value1.shortValue() + summand.getValue1().shortValue())),
					(T) Short.valueOf((short) (value2.shortValue() + summand.getValue2().shortValue()))
			);
		}
		throw new UnsupportedOperationException("Type not supported");
	}

	/**
	 * Subtracts another vector from this vector and returns the result.
	 *
	 * @param subtrahend the vector to subtract
	 * @return the resulting vector after subtraction
	 * @throws UnsupportedOperationException if the type is not supported
	 */
	@SuppressWarnings("unchecked")
	public Vec2<T> subtract(Vec2<T> subtrahend) {
		if (value1 instanceof Integer) {
			return new Vec2<>(
					(T) Integer.valueOf(value1.intValue() - subtrahend.getValue1().intValue()),
					(T) Integer.valueOf(value2.intValue() - subtrahend.getValue2().intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec2<>(
					(T) Long.valueOf(value1.longValue() - subtrahend.getValue1().longValue()),
					(T) Long.valueOf(value2.longValue() - subtrahend.getValue2().longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec2<>(
					(T) Float.valueOf(value1.floatValue() - subtrahend.getValue1().floatValue()),
					(T) Float.valueOf(value2.floatValue() - subtrahend.getValue2().floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec2<>(
					(T) Double.valueOf(value1.doubleValue() - subtrahend.getValue1().doubleValue()),
					(T) Double.valueOf(value2.doubleValue() - subtrahend.getValue2().doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec2<>(
					(T) Byte.valueOf((byte) (value1.byteValue() - subtrahend.getValue1().byteValue())),
					(T) Byte.valueOf((byte) (value2.byteValue() - subtrahend.getValue2().byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec2<>(
					(T) Short.valueOf((short) (value1.shortValue() - subtrahend.getValue1().shortValue())),
					(T) Short.valueOf((short) (value2.shortValue() - subtrahend.getValue2().shortValue()))
			);
		}
		throw new UnsupportedOperationException("Type not supported");
	}

	/**
	 * Multiplies both components of the vector by a scalar factor.
	 *
	 * @param factor the scalar to multiply by
	 * @return the resulting scaled vector
	 * @throws UnsupportedOperationException if the type is not supported
	 */
	@SuppressWarnings("unchecked")
	public Vec2<T> multiply(T factor) {
		if (value1 instanceof Integer) {
			return new Vec2<>(
					(T) Integer.valueOf(value1.intValue() * factor.intValue()),
					(T) Integer.valueOf(value2.intValue() * factor.intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec2<>(
					(T) Long.valueOf(value1.longValue() * factor.longValue()),
					(T) Long.valueOf(value2.longValue() * factor.longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec2<>(
					(T) Float.valueOf(value1.floatValue() * factor.floatValue()),
					(T) Float.valueOf(value2.floatValue() * factor.floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec2<>(
					(T) Double.valueOf(value1.doubleValue() * factor.doubleValue()),
					(T) Double.valueOf(value2.doubleValue() * factor.doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec2<>(
					(T) Byte.valueOf((byte) (value1.byteValue() * factor.byteValue())),
					(T) Byte.valueOf((byte) (value2.byteValue() * factor.byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec2<>(
					(T) Short.valueOf((short) (value1.shortValue() * factor.shortValue())),
					(T) Short.valueOf((short) (value2.shortValue() * factor.shortValue()))
			);
		}
		throw new UnsupportedOperationException("Type not supported");
	}

	/**
	 * Divides both components of the vector by a scalar divisor.
	 *
	 * @param divisor the scalar to divide by
	 * @return the resulting scaled vector
	 * @throws UnsupportedOperationException if the type is not supported
	 */
	@SuppressWarnings("unchecked")
	public Vec2<T> divide(T divisor) {
		if (value1 instanceof Integer) {
			return new Vec2<>(
					(T) Integer.valueOf(value1.intValue() / divisor.intValue()),
					(T) Integer.valueOf(value2.intValue() / divisor.intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec2<>(
					(T) Long.valueOf(value1.longValue() / divisor.longValue()),
					(T) Long.valueOf(value2.longValue() / divisor.longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec2<>(
					(T) Float.valueOf(value1.floatValue() / divisor.floatValue()),
					(T) Float.valueOf(value2.floatValue() / divisor.floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec2<>(
					(T) Double.valueOf(value1.doubleValue() / divisor.doubleValue()),
					(T) Double.valueOf(value2.doubleValue() / divisor.doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec2<>(
					(T) Byte.valueOf((byte) (value1.byteValue() / divisor.byteValue())),
					(T) Byte.valueOf((byte) (value2.byteValue() / divisor.byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec2<>(
					(T) Short.valueOf((short) (value1.shortValue() / divisor.shortValue())),
					(T) Short.valueOf((short) (value2.shortValue() / divisor.shortValue()))
			);
		}
		throw new UnsupportedOperationException("Type not supported");
	}

	/**
	 * Calculates the dot product of this vector and another vector.
	 *
	 * @param other the other vector
	 * @return the dot product as type T
	 * @throws UnsupportedOperationException if the type is not supported
	 */
	@SuppressWarnings("unchecked")
	public T dotProduct(Vec2<T> other) {
		if (value1 instanceof Integer) {
			return (T) Integer.valueOf(value1.intValue() * other.getValue1().intValue() + value2.intValue() * other.getValue2().intValue());
		} else if (value1 instanceof Long) {
			return (T) Long.valueOf(value1.longValue() * other.getValue1().longValue() + value2.longValue() * other.getValue2().longValue());
		} else if (value1 instanceof Float) {
			return (T) Float.valueOf(value1.floatValue() * other.getValue1().floatValue() + value2.floatValue() * other.getValue2().floatValue());
		} else if (value1 instanceof Double) {
			return (T) Double.valueOf(value1.doubleValue() * other.getValue1().doubleValue() + value2.doubleValue() * other.getValue2().doubleValue());
		} else if (value1 instanceof Byte) {
			return (T) Byte.valueOf((byte) (value1.byteValue() * other.getValue1().byteValue() + value2.byteValue() * other.getValue2().byteValue()));
		} else if (value1 instanceof Short) {
			return (T) Short.valueOf((short) (value1.shortValue() * other.getValue1().shortValue() + value2.shortValue() * other.getValue2().shortValue()));
		}
		throw new UnsupportedOperationException("Type not supported");
	}

	/**
	 * Compares this vector to another vector based on their lengths.
	 *
	 * @param comparator the vector to compare to
	 * @return a negative integer, zero, or a positive integer as this vector is shorter, equal, or longer
	 */
	public int compareTo(Vec2<T> comparator) {
		return Double.compare(this.getLength(), comparator.getLength());
	}

	/**
	 * Returns a normalized (unit length) version of this vector as a {@code Vec2<Double>}.
	 *
	 * @return the normalized vector
	 * @throws ArithmeticException if the vector is zero-length
	 */
	public Vec2<Double> normalize() {
		double len = getLength();
		if (len == 0) throw new ArithmeticException("Cannot normalize zero vector");
		return new Vec2<>(value1.doubleValue() / len, value2.doubleValue() / len);
	}

	/**
	 * Returns the angle of the vector in radians relative to the x-axis.
	 *
	 * @return the angle in radians
	 */
	public double angle() {
		return Math.atan2(value2.doubleValue(), value1.doubleValue());
	}

	/**
	 * Calculates the Euclidean distance to another vector.
	 *
	 * @param other the other vector
	 * @return the distance between the vectors
	 */
	public double distanceTo(Vec2<T> other) {
		double dx = value1.doubleValue() - other.value1.doubleValue();
		double dy = value2.doubleValue() - other.value2.doubleValue();
		return Math.sqrt(dx * dx + dy * dy);
	}
}