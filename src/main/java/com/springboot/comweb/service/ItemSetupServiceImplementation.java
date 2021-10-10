package com.springboot.comweb.service;

import com.springboot.comweb.entity.Item;
import com.springboot.comweb.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemSetupServiceImplementation implements ItemSetupService {

    public ItemRepository itemRepository;

    public ItemSetupServiceImplementation(ItemRepository theItemRepository) {
        itemRepository = theItemRepository;
    }



    @Override
    public void save(Item theItem) {

        Item result = itemRepository.findByItemName(theItem.getItemName());
        if (result != null){
            throw new RuntimeException("Item already exists");
        }else{
            itemRepository.save(theItem);
        }

    }

    @Override
    public List<Item> findAll() {
        return itemRepository.findAll();

    }


}
