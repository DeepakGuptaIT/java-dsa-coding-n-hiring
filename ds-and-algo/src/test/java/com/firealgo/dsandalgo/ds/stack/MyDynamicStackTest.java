package com.firealgo.dsandalgo.ds.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit tests for MyDynamicStack
 *
 * Focus Areas:
 * 1. Core operations (push, pop, peek)
 * 2. Resize behavior (dynamic capacity growth)
 * 3. Edge cases (empty stack operations)
 * 4. LIFO property validation
 */
class MyDynamicStackTest {

    private MyDynamicStack stack;

    /**
     * Runs before each test
     * Creates a fresh stack instance to ensure test isolation
     */
    @BeforeEach
    void setUp() {
        stack = new MyDynamicStack(2); // small capacity to test resizing easily
    }

    /**
     * Test basic push and size behavior
     *
     * Verifies:
     * - Elements are added correctly
     * - Size updates properly
     */
    @Test
    @DisplayName("Push elements and verify size")
    void testPushAndSize() {
        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size());
        assertFalse(stack.isStackEmpty());
    }

    /**
     * Test LIFO (Last In First Out) property
     *
     * Verifies:
     * - Last pushed element is popped first
     */
    @Test
    @DisplayName("Verify LIFO behavior")
    void testLIFO() {
        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    /**
     * Test peek operation
     *
     * Verifies:
     * - Peek returns top element
     * - Does NOT remove element
     */
    @Test
    @DisplayName("Peek should return top without removing")
    void testPeek() {
        stack.push(100);
        stack.push(200);

        assertEquals(200, stack.peek()); // top element
        assertEquals(2, stack.size());   // size unchanged
    }

    /**
     * Test dynamic resizing of stack
     *
     * Verifies:
     * - Stack grows when capacity is exceeded
     * - No data loss after resizing
     */
    @Test
    @DisplayName("Stack should resize dynamically")
    void testDynamicResize() {
        stack.push(1);
        stack.push(2);
        stack.push(3); // triggers resize

        assertEquals(3, stack.size());

        // Ensure order is preserved
        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    /**
     * Test pop on empty stack
     *
     * Verifies:
     * - Exception is thrown when popping empty stack
     */
    @Test
    @DisplayName("Pop on empty stack should throw exception")
    void testPopOnEmptyStack() {
        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    /**
     * Test peek on empty stack
     *
     * Verifies:
     * - Exception is thrown when peeking empty stack
     */
    @Test
    @DisplayName("Peek on empty stack should throw exception")
    void testPeekOnEmptyStack() {
        assertThrows(RuntimeException.class, () -> stack.peek());
    }

    /**
     * Test multiple push-pop cycles
     *
     * Verifies:
     * - Stack remains consistent after multiple operations
     */
    @Test
    @DisplayName("Multiple push-pop cycles should maintain consistency")
    void testMultipleOperations() {
        stack.push(10);
        stack.push(20);
        stack.pop();

        stack.push(30);
        stack.push(40);

        assertEquals(40, stack.pop());
        assertEquals(30, stack.pop());
        assertEquals(10, stack.pop());
    }

    /**
     * Test isStackEmpty behavior
     *
     * Verifies:
     * - Correct state before and after operations
     */
    @Test
    @DisplayName("isStackEmpty should reflect correct state")
    void testIsEmpty() {
        assertTrue(stack.isStackEmpty());

        stack.push(1);
        assertFalse(stack.isStackEmpty());

        stack.pop();
        assertTrue(stack.isStackEmpty());
    }
}