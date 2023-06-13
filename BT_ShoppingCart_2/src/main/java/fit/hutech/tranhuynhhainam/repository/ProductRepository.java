package fit.hutech.tranhuynhhainam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fit.hutech.tranhuynhhainam.model.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

}