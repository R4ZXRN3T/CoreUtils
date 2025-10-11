package org.R4ZXRN3T.Vectors;

/**
 * Represents a generic 3-dimensional vector with numeric components.
 * Supports basic vector arithmetic and utility operations.
 *
 * @param <T> the type of the numeric components, must extend {@link Number}. To be fully compatible with the implementation, it must be of type {@link Integer}, {@link Long}, {@link Float}, {@link Double}, {@link Short} or {@link Byte}.
 */
public class Vec3<T extends Number> {
	private T value1;
	private T value2;
	private T value3;

	/**
	 * Constructs a new vector with the specified components.
	 *
	 * @param value1 the first component
	 * @param value2 the second component
	 * @param value3 the third component
	 */
	public Vec3(T value1, T value2, T value3) {
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}

	public T getValue1() {
		return value1;
	}

	public void setValue1(T value) {
		this.value1 = value;
	}

	public T getValue2() {
		return value2;
	}

	public void setValue2(T value) {
		this.value2 = value;
	}

	public T getValue3() {
		return value3;
	}

	public void setValue3(T value) {
		this.value3 = value;
	}

	@Override
	public String toString() {
		return "(" + value1 + ", " + value2 + ", " + value3 + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Vec3<?> vec3 = (Vec3<?>) obj;
		return value1.equals(vec3.value1) && value2.equals(vec3.value2) && value3.equals(vec3.value3);
	}

	@Override
	public int hashCode() {
		return java.util.Objects.hash(value1, value2, value3);
	}

	/**
	 * Calculates the Euclidean length (magnitude) of the vector.
	 *
	 * @return the length of the vector
	 */
	public double getLength() {
		return Math.sqrt(Math.pow(value1.doubleValue(), 2) + Math.pow(value2.doubleValue(), 2) + Math.pow(value3.doubleValue(), 2));
	}

	/**
	 * Adds another vector to this vector and returns the result.
	 */
	@SuppressWarnings("unchecked")
	public Vec3<T> add(Vec3<T> summand) {
		if (value1 instanceof Integer) {
			return new Vec3<>(
				(T) Integer.valueOf(value1.intValue() + summand.getValue1().intValue()),
				(T) Integer.valueOf(value2.intValue() + summand.getValue2().intValue()),
				(T) Integer.valueOf(value3.intValue() + summand.getValue3().intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec3<>(
				(T) Long.valueOf(value1.longValue() + summand.getValue1().longValue()),
				(T) Long.valueOf(value2.longValue() + summand.getValue2().longValue()),
				(T) Long.valueOf(value3.longValue() + summand.getValue3().longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec3<>(
				(T) Float.valueOf(value1.floatValue() + summand.getValue1().floatValue()),
				(T) Float.valueOf(value2.floatValue() + summand.getValue2().floatValue()),
				(T) Float.valueOf(value3.floatValue() + summand.getValue3().floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec3<>(
				(T) Double.valueOf(value1.doubleValue() + summand.getValue1().doubleValue()),
				(T) Double.valueOf(value2.doubleValue() + summand.getValue2().doubleValue()),
				(T) Double.valueOf(value3.doubleValue() + summand.getValue3().doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec3<>(
				(T) Byte.valueOf((byte) (value1.byteValue() + summand.getValue1().byteValue())),
				(T) Byte.valueOf((byte) (value2.byteValue() + summand.getValue2().byteValue())),
				(T) Byte.valueOf((byte) (value3.byteValue() + summand.getValue3().byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec3<>(
				(T) Short.valueOf((short) (value1.shortValue() + summand.getValue1().shortValue())),
				(T) Short.valueOf((short) (value2.shortValue() + summand.getValue2().shortValue())),
				(T) Short.valueOf((short) (value3.shortValue() + summand.getValue3().shortValue()))
			);
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Subtracts another vector from this vector and returns the result.
	 */
	@SuppressWarnings("unchecked")
	public Vec3<T> subtract(Vec3<T> subtrahend) {
		if (value1 instanceof Integer) {
			return new Vec3<>(
				(T) Integer.valueOf(value1.intValue() - subtrahend.getValue1().intValue()),
				(T) Integer.valueOf(value2.intValue() - subtrahend.getValue2().intValue()),
				(T) Integer.valueOf(value3.intValue() - subtrahend.getValue3().intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec3<>(
				(T) Long.valueOf(value1.longValue() - subtrahend.getValue1().longValue()),
				(T) Long.valueOf(value2.longValue() - subtrahend.getValue2().longValue()),
				(T) Long.valueOf(value3.longValue() - subtrahend.getValue3().longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec3<>(
				(T) Float.valueOf(value1.floatValue() - subtrahend.getValue1().floatValue()),
				(T) Float.valueOf(value2.floatValue() - subtrahend.getValue2().floatValue()),
				(T) Float.valueOf(value3.floatValue() - subtrahend.getValue3().floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec3<>(
				(T) Double.valueOf(value1.doubleValue() - subtrahend.getValue1().doubleValue()),
				(T) Double.valueOf(value2.doubleValue() - subtrahend.getValue2().doubleValue()),
				(T) Double.valueOf(value3.doubleValue() - subtrahend.getValue3().doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec3<>(
				(T) Byte.valueOf((byte) (value1.byteValue() - subtrahend.getValue1().byteValue())),
				(T) Byte.valueOf((byte) (value2.byteValue() - subtrahend.getValue2().byteValue())),
				(T) Byte.valueOf((byte) (value3.byteValue() - subtrahend.getValue3().byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec3<>(
				(T) Short.valueOf((short) (value1.shortValue() - subtrahend.getValue1().shortValue())),
				(T) Short.valueOf((short) (value2.shortValue() - subtrahend.getValue2().shortValue())),
				(T) Short.valueOf((short) (value3.shortValue() - subtrahend.getValue3().shortValue()))
			);
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Multiplies all components of the vector by a scalar factor.
	 */
	@SuppressWarnings("unchecked")
	public Vec3<T> multiply(T factor) {
		if (value1 instanceof Integer) {
			return new Vec3<>(
				(T) Integer.valueOf(value1.intValue() * factor.intValue()),
				(T) Integer.valueOf(value2.intValue() * factor.intValue()),
				(T) Integer.valueOf(value3.intValue() * factor.intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec3<>(
				(T) Long.valueOf(value1.longValue() * factor.longValue()),
				(T) Long.valueOf(value2.longValue() * factor.longValue()),
				(T) Long.valueOf(value3.longValue() * factor.longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec3<>(
				(T) Float.valueOf(value1.floatValue() * factor.floatValue()),
				(T) Float.valueOf(value2.floatValue() * factor.floatValue()),
				(T) Float.valueOf(value3.floatValue() * factor.floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec3<>(
				(T) Double.valueOf(value1.doubleValue() * factor.doubleValue()),
				(T) Double.valueOf(value2.doubleValue() * factor.doubleValue()),
				(T) Double.valueOf(value3.doubleValue() * factor.doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec3<>(
				(T) Byte.valueOf((byte) (value1.byteValue() * factor.byteValue())),
				(T) Byte.valueOf((byte) (value2.byteValue() * factor.byteValue())),
				(T) Byte.valueOf((byte) (value3.byteValue() * factor.byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec3<>(
				(T) Short.valueOf((short) (value1.shortValue() * factor.shortValue())),
				(T) Short.valueOf((short) (value2.shortValue() * factor.shortValue())),
				(T) Short.valueOf((short) (value3.shortValue() * factor.shortValue()))
			);
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Divides all components of the vector by a scalar divisor.
	 */
	@SuppressWarnings("unchecked")
	public Vec3<T> divide(T divisor) {
		if (value1 instanceof Integer) {
			return new Vec3<>(
				(T) Integer.valueOf(value1.intValue() / divisor.intValue()),
				(T) Integer.valueOf(value2.intValue() / divisor.intValue()),
				(T) Integer.valueOf(value3.intValue() / divisor.intValue())
			);
		} else if (value1 instanceof Long) {
			return new Vec3<>(
				(T) Long.valueOf(value1.longValue() / divisor.longValue()),
				(T) Long.valueOf(value2.longValue() / divisor.longValue()),
				(T) Long.valueOf(value3.longValue() / divisor.longValue())
			);
		} else if (value1 instanceof Float) {
			return new Vec3<>(
				(T) Float.valueOf(value1.floatValue() / divisor.floatValue()),
				(T) Float.valueOf(value2.floatValue() / divisor.floatValue()),
				(T) Float.valueOf(value3.floatValue() / divisor.floatValue())
			);
		} else if (value1 instanceof Double) {
			return new Vec3<>(
				(T) Double.valueOf(value1.doubleValue() / divisor.doubleValue()),
				(T) Double.valueOf(value2.doubleValue() / divisor.doubleValue()),
				(T) Double.valueOf(value3.doubleValue() / divisor.doubleValue())
			);
		} else if (value1 instanceof Byte) {
			return new Vec3<>(
				(T) Byte.valueOf((byte) (value1.byteValue() / divisor.byteValue())),
				(T) Byte.valueOf((byte) (value2.byteValue() / divisor.byteValue())),
				(T) Byte.valueOf((byte) (value3.byteValue() / divisor.byteValue()))
			);
		} else if (value1 instanceof Short) {
			return new Vec3<>(
				(T) Short.valueOf((short) (value1.shortValue() / divisor.shortValue())),
				(T) Short.valueOf((short) (value2.shortValue() / divisor.shortValue())),
				(T) Short.valueOf((short) (value3.shortValue() / divisor.shortValue()))
			);
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Calculates the dot product of this vector and another vector.
	 */
	@SuppressWarnings("unchecked")
	public T dotProduct(Vec3<T> other) {
		if (value1 instanceof Integer) {
			return (T) Integer.valueOf(value1.intValue() * other.getValue1().intValue() + value2.intValue() * other.getValue2().intValue() + value3.intValue() * other.getValue3().intValue());
		} else if (value1 instanceof Long) {
			return (T) Long.valueOf(value1.longValue() * other.getValue1().longValue() + value2.longValue() * other.getValue2().longValue() + value3.longValue() * other.getValue3().longValue());
		} else if (value1 instanceof Float) {
			return (T) Float.valueOf(value1.floatValue() * other.getValue1().floatValue() + value2.floatValue() * other.getValue2().floatValue() + value3.floatValue() * other.getValue3().floatValue());
		} else if (value1 instanceof Double) {
			return (T) Double.valueOf(value1.doubleValue() * other.getValue1().doubleValue() + value2.doubleValue() * other.getValue2().doubleValue() + value3.doubleValue() * other.getValue3().doubleValue());
		} else if (value1 instanceof Byte) {
			return (T) Byte.valueOf((byte) (value1.byteValue() * other.getValue1().byteValue() + value2.byteValue() * other.getValue2().byteValue() + value3.byteValue() * other.getValue3().byteValue()));
		} else if (value1 instanceof Short) {
			return (T) Short.valueOf((short) (value1.shortValue() * other.getValue1().shortValue() + value2.shortValue() * other.getValue2().shortValue() + value3.shortValue() * other.getValue3().shortValue()));
		} else {
			throw new UnsupportedOperationException("Type not supported");
		}
	}

	/**
	 * Compares this vector to another vector based on their lengths.
	 */
	public int compareTo(Vec3<T> comparator) {
		return Double.compare(this.getLength(), comparator.getLength());
	}

	/**
	 * Returns a normalized (unit length) version of this vector as a {@code Vec3<Double>}.
	 */
	public Vec3<Double> normalize() {
		double len = getLength();
		if (len == 0) throw new ArithmeticException("Cannot normalize zero vector");
		return new Vec3<>(value1.doubleValue() / len, value2.doubleValue() / len, value3.doubleValue() / len);
	}

	/**
	 * Returns the angles of the vector in radians relative to the axes.
	 * Returns an array: [theta, phi], where theta is the azimuthal angle in the x-y plane, phi is the polar angle from the z-axis.
	 */
	public double[] angles() {
		double r = getLength();
		double theta = Math.atan2(value2.doubleValue(), value1.doubleValue()); // azimuthal angle
		double phi = Math.acos(value3.doubleValue() / r); // polar angle
		return new double[]{theta, phi};
	}

	/**
	 * Calculates the Euclidean distance to another vector.
	 */
	public double distanceTo(Vec3<T> other) {
		double dx = value1.doubleValue() - other.value1.doubleValue();
		double dy = value2.doubleValue() - other.value2.doubleValue();
		double dz = value3.doubleValue() - other.value3.doubleValue();
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}

	/**
	 * Calculates the cross product of this vector and another vector, returning a new Vec3<Double>.
	 */
	public Vec3<Double> crossProduct(Vec3<T> other) {
		double x = value2.doubleValue() * other.value3.doubleValue() - value3.doubleValue() * other.value2.doubleValue();
		double y = value3.doubleValue() * other.value1.doubleValue() - value1.doubleValue() * other.value3.doubleValue();
		double z = value1.doubleValue() * other.value2.doubleValue() - value2.doubleValue() * other.value1.doubleValue();
		return new Vec3<>(x, y, z);
	}
}