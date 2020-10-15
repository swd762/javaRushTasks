package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;
    private List<Entry<String>> treeList = new ArrayList<>();


    @Override
    public int size() {
        return treeList.size()-1;
    }

    public String getParent(String s) {
        for (Entry<String> entry: treeList) {
            if (entry.elementName.equals(s)) {
                return entry.parent.elementName;
            }
        }
        return null;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    public CustomTree() {
        root = new Entry<>("0");
        treeList.add(0, root);
    }

    @Override
    public boolean add(String s) {
        Entry<String> current;
        Entry<String> newEntry = new Entry<String>(s);

        for(Entry<String> entry: treeList) {
            current = entry;
            if (current.isAvailableToAddChildren()) {
                if (current.leftChild == null) {
                    current.leftChild = newEntry;
                    current.availableToAddLeftChildren = false;
                } else if (current.rightChild == null) {
                    current.rightChild = newEntry;
                    current.availableToAddRightChildren = false;
                }
                newEntry.parent = current;
                treeList.add(newEntry);
                return true;
            }
        }
        return false;
    }


    static class Entry<T> implements Serializable {
        String elementName;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry (String name) {
            elementName = name;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }
        public boolean isAvailableToAddChildren () {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }

}
