/*
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package pyspark_cassandra.types;

import java.util.List;

import scala.collection.immutable.IndexedSeq;

import com.datastax.spark.connector.UDTValue;

public class UDTValueUnpickler extends StructUnpickler {
	public Object construct(List<String> fieldNames, List<Object> fieldValues) {
		IndexedSeq<String> fieldNamesSeq = Types.toArraySeq(fieldNames).toIndexedSeq();
		IndexedSeq<Object> fieldValuesSeq = Types.toArraySeq(fieldValues).toIndexedSeq();
		return new UDTValue(fieldNamesSeq, fieldValuesSeq);
	}
}
